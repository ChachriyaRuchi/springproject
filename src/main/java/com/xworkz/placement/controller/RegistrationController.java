package com.xworkz.placement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.engine.config.internal.ConfigurationServiceImpl;
import org.hibernate.engine.config.spi.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.service.RegistraionService;


@RestController("/")
public class RegistrationController {
	private final Logger logger = LogManager.getLogger(RegistrationController.class);

	@Autowired
	private RegistraionService registrationService;

	@GetMapping("displayRegistration.do")
	public ModelAndView displayRegistration() {
		
		return new ModelAndView("registration");
	}

	@PostMapping("register.do")
	public ModelAndView onAddRegistrationButtonClicked(RegistrationDTO registrationDTO){
		//logger.info("INFO - login method invoked");
		
		

		try {

			boolean isValidate=registrationService.saveData(registrationDTO);
			if(isValidate) {
				
			}
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ModelAndView("error");
		}
		return new ModelAndView("success");
	}

}
