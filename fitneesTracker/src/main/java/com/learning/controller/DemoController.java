package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {

	@RequestMapping(value="/greeting")
	public String sayHello(Model model)
	{
		System.err.println("testing github push..............");
		model.addAttribute("greeting", "test");
		return "hello";
	}
}
