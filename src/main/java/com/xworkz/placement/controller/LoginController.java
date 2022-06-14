package com.xworkz.placement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.LoginDTO;

@Controller
public class LoginController {

	@PostMapping("/login.do")
	public ModelAndView login(LoginDTO loginDto) {
		System.out.println(loginDto.getUsername());
		System.out.println(loginDto.getPassword());
		return new ModelAndView("success","dto",loginDto);
		
	}
}
