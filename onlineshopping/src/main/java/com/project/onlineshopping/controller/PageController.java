package com.project.onlineshopping.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value = {"/", "/index", "/home"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("page");
		mv.addObject("greeting", "Welcome to spring MVC");
		mv.addObject("myName", "MD AZHAR");
		return mv;
	}
	//RequestParam used for Query string
	//http://localhost:8080/onlineshopping/test?myName=MD%20ANAS&message=Welcome%20in%20spring%20MVC%20programming%20world
	@RequestMapping(value = {"/test"})
	public ModelAndView requestParamExample(@RequestParam("myName")String myName, @RequestParam("message")String message ){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("page");
		mv.addObject("greeting", message);
		mv.addObject("myName", myName);
		
		return mv;
	}
	
	//RequestParam used for Query string
		//http://localhost:8080/onlineshopping/test/?myName=MD%20ANAS&message=Welcome%20in%20spring%20MVC%20programming%20world
		@RequestMapping(value = {"/test/{myName}/{message}"})
		public ModelAndView pathParamExample(@PathVariable("myName")String myName, @PathVariable("message")String message ){
			ModelAndView mv = new ModelAndView();
			mv.setViewName("page");
			mv.addObject("greeting", message);
			mv.addObject("myName", myName);
			
			return mv;
		}
	
}
