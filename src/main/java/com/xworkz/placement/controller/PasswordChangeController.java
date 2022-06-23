package com.xworkz.placement.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.service.PasswordChangeServiceImpl;
@Controller
public class PasswordChangeController {
	private final Logger logger=LogManager.getLogger(LoginController.class);
	
	@Autowired
	private PasswordChangeServiceImpl changeService;
	
	@PostMapping("/passwordChange.do")
	public ModelAndView changePassword(PasswordChangeDTO passwordChangeDTO) {
		
		changeService.changePassword(passwordChangeDTO);
		return new ModelAndView("change-password");
	}
}
