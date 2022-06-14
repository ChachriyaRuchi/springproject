package com.xworkz.placement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.RegistrationDTO;

@Controller
public class RegistrationController {
	
	@PostMapping("register.do")
	public ModelAndView registrationdetails(RegistrationDTO registrationDTO) {
		System.out.println(registrationDTO.getPassword().generatePassayPassword());
		return new ModelAndView("success","register",registrationDTO);
	}
	
}
