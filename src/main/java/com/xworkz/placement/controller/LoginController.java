package com.xworkz.placement.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.service.LoginService;

@Controller
public class LoginController {
	
	private final Logger logger=LogManager.getLogger(LoginController.class);
	 
	
	@Autowired
	private LoginService loginService;

	
	@PostMapping("/login.do")
	public ModelAndView login(LoginDTO loginDto,HttpSession session) throws Exception {
		logger.info("INFO - login method invoked");
		session.getServletContext();
	
		 loginService.validateUser(loginDto);
		
		if (loginService.validateUser(loginDto)!=null) {
			session.setAttribute("details",loginService.validateUser(loginDto));
			return new ModelAndView("login-success","dto",loginDto);
		} else {
			//return new ModelAndView("error","dto","invalid credentials");
			throw new Exception("Invalid username and password");
		}
	
		
		
	}
}
