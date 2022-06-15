package com.xworkz.placement.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;

@Controller
public class RegistrationController {
	

	@GetMapping("displayRegistration.do")
	public ModelAndView displayRegistration() {
		return new ModelAndView("registration");
	}

	
	 @PostMapping("register.do") public ModelAndView 
	 registrationdetails(RegistrationDTO registrationDTO) { 
	 //System.out.println(registrationDTO.getPassword().generatePassayPassword());
	UserEntity entity = new UserEntity(); 
	 BeanUtils.copyProperties(registrationDTO, entity);
	 return new ModelAndView("success","register",registrationDTO); } 
	  
	 
}
