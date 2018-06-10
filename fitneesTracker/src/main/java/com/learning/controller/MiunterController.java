package com.learning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learning.model.Activity;
import com.learning.model.Excercise;
import com.learning.service.ExcerciseService;

@Controller
public class MiunterController {

	
	@Autowired
	private ExcerciseService excercises;
	
	
	
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
	
	

	@RequestMapping(value="/activities")
	public @ResponseBody List<Activity> findallActivites(@ModelAttribute ("excercise") Excercise excercise)
	{
		System.err.println("final value");
		System.err.println(excercise.getMinutes());
		List<Activity> result=excercises.finndAllActivites();
		return result;
	}
	
	
	
}
