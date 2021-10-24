package br.com.brunoti.diospringwebmvc.controller;

import br.com.brunoti.diospringwebmvc.model.Jedi;
import br.com.brunoti.diospringwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;


@Controller
public class JediController {

	@Autowired
	private JediRepository repository;

	@GetMapping("/jedi")
	public ModelAndView jedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");

		final Jedi luke = new Jedi("Luke", "skywalker");
		modelAndView.addObject("allJedi", repository.getAllJedi());

		return modelAndView;
	}

	@GetMapping("/new-jedi")
	public ModelAndView createJedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi");

		modelAndView.addObject("jedi", new Jedi());

		return modelAndView;
	}

	@PostMapping("/jedi")
	public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult result) {

		if (result.hasErrors()) {
			return "new-jedi";
		}

		repository.createJedi(jedi);

		return "redirect:jedi";
	}
}