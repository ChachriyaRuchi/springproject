package com.xworkz.placement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.service.PasswordChangeService;

public class PasswordChangeContoller {
	private final Logger logger=LogManager.getLogger(LoginController.class);
	
	private PasswordChangeService changeService;
	
	@PostMapping("/passwordChange.do")
	public ModelAndView changePassword(PasswordChangeDTO changeDTO) {
		
		changeService.changePassword(changeDTO);
		return new ModelAndView("change-password");
	}
}
