package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.model.Excercise;

@Controller
public class MiunterController {

	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("excercise") Excercise excercise)
	{
		System.err.println("Main");
		System.err.println(excercise.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value="/addMinutesForward")
	public String addMinutesForward(@ModelAttribute ("excercise") Excercise excercise)
	{
		System.err.println("Forward");
		System.err.println(excercise.getMinutes());
		return "forward:addMoreMinutes.html";
	}
	
	@RequestMapping(value="/addMinutesRedirect")
	public String addMinutesRedirect(@ModelAttribute ("excercise") Excercise excercise)
	{
		System.err.println("redirct");
		System.err.println(excercise.getMinutes());
		return "redirect:addMoreMinutes.html";
	}
	
	
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("excercise") Excercise excercise)
	{
		System.err.println("final value");
		System.err.println(excercise.getMinutes());
		return "addMinutes";
	}
	
	

	
}
