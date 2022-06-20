package com.xworkz.placement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.service.RegistrationService;

@RestController("/")
public class RegistrationController {
	private final Logger logger = LogManager.getLogger(RegistrationController.class);

	@Autowired
	private RegistrationService registrationService;

	@GetMapping("displayRegistration.do")
	public ModelAndView displayRegistration() {
		
		return new ModelAndView("registration");
	}

	@PostMapping("register.do")
	public ModelAndView saveRegistrationDetails(  RegistrationDTO registrationDTO) {
		//logger.info("INFO - login method invoked");

		try {
			registrationService.saveData(registrationDTO);
			
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ModelAndView("error");
		}
		return new ModelAndView("success");
	}

}
