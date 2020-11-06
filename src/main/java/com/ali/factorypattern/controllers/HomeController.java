package com.ali.factorypattern.controllers;

import java.text.DateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ali.factorypattern.service.Program;
import com.ali.factorypattern.service.ProgramFactory;

/**
 * @author Muhammad Ali Farooq
 * @date   Nov 6, 2020
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
	@RequestMapping("/showCriteria")
	public String showCriteria(Model model) {
		logger.info("Inside Controller");
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate ); 
		
		return "home";
	}
	
	
	@RequestMapping("/fetchProgram")
	public ModelAndView fetchProgram(HttpServletRequest request, HttpServletResponse response) {
		
		String stuName = (String) request.getParameter("name");
		String stuProgram = (String) request.getParameter("program");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		if(!stuProgram.isEmpty()) {
			Program program  =  ProgramFactory.getProgram(stuProgram);
			mv.addObject("enrollmentMsg",program.enrollProgram(stuName));
			mv.addObject("Courses", program.getCourses());
		}
		return mv;
	}
	
}
