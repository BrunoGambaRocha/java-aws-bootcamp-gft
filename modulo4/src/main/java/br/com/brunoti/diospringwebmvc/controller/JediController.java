package br.com.brunoti.diospringwebmvc.controller;

import br.com.brunoti.diospringwebmvc.model.Jedi;
import br.com.brunoti.diospringwebmvc.repository.JediRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class JediController {

	@Autowired
	private JediRepository repository;

	@GetMapping("/jedi")
	public ModelAndView jedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");
		modelAndView.addObject("allJedi", repository.findAll());

		return modelAndView;
	}

	@GetMapping("/jedi/name/{name}")
	public ResponseEntity<Jedi> getEmployeeByName(@PathVariable String name) {
		Jedi jedi = repository.findByName(name);
		return new ResponseEntity<Jedi>(jedi, HttpStatus.OK);
	}

	@GetMapping("/new-jedi")
	public ModelAndView newJedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("new-jedi");

		modelAndView.addObject("jedi", new Jedi());

		return modelAndView;
	}

	@PostMapping("/jedi")
	public String createJedi(@Valid @ModelAttribute Jedi jedi, BindingResult result, RedirectAttributes redirect) {

		if (result.hasErrors()) {
			return "new-jedi";
		}

		repository.save(jedi);
		redirect.addFlashAttribute("message", "Jedi successfully created.");

		return "redirect:jedi";
	}
}