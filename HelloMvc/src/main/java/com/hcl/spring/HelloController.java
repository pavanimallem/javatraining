package com.hcl.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class HelloController {
	@RequestMapping("/hello")
	public ModelAndView sayHello() {
		return new ModelAndView("resultpage",
				"message", "welcome to spring");
	}
	@RequestMapping("/priya")
	public ModelAndView sayPriya() {
		return new ModelAndView("Priya");
	}
	@RequestMapping("/about")
	public ModelAndView sayAbout() {
		return new ModelAndView("about");
	}
	@RequestMapping("/contact")
	public ModelAndView sayContact() {
		return new ModelAndView("contact");
	}
}
