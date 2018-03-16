package com.train.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller("appController")
public class AppController {

	@RequestMapping("/")
	public ModelAndView homepage() {
		ModelAndView model = new ModelAndView("index");
		return model;
	}
	
	@RequestMapping("/contact")
	public ModelAndView admin() {
		ModelAndView model = new ModelAndView("contact");
		return model;
	}
}
