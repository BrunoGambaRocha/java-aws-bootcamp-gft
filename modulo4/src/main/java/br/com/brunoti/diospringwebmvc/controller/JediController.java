package br.com.brunoti.diospringwebmvc.controller;

import br.com.brunoti.diospringwebmvc.model.Jedi;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class JediController {

	@GetMapping("/jedi")
	public ModelAndView jedi() {

		final ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("jedi");

		final Jedi luke = new Jedi("Luke", "skywalker");
		modelAndView.addObject("allJedi", List.of(luke));

		return modelAndView;
	}
}