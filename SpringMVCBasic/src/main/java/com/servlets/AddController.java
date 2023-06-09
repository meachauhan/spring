package com.servlets;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("n1") int i,@RequestParam("n2") int j) {
		
//		int i=Integer.parseInt(request.getParameter("n1"));
//		int j=Integer.parseInt(request.getParameter("n2"));
		int result=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", result);
		return mv;
	}
}
