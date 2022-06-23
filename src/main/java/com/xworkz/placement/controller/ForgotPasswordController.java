package com.xworkz.placement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xworkz.placement.dto.ChangeForgotPasswordDTO;
import com.xworkz.placement.dto.ForgotPasswordDTO;
import com.xworkz.placement.service.ForgotPasswordService;

@Controller
public class ForgotPasswordController {
	@Autowired
	ForgotPasswordService forgotPasswordService;
	
	@GetMapping("forgotPassword.do")
	public ModelAndView forgotPassword() {
		
		return new ModelAndView("reset-password");
	}
	
	@PostMapping("forgotPasswordSubmit.do")
	public ModelAndView checkEmail(ForgotPasswordDTO forgotPasswordDTO) {
		boolean checkEmail=forgotPasswordService.checkEmail(forgotPasswordDTO);
		if(checkEmail) {
			return new ModelAndView("forgot-password-change");	
		}
		else {
			return new ModelAndView("error");
		}
		
		
	}
	@PostMapping("changeForgotPassword.do")
	public ModelAndView changePassword(ChangeForgotPasswordDTO changeForgotPasswordDTO,ForgotPasswordDTO forgotPasswordDTO) {
		
		boolean changePassword=forgotPasswordService.verifyNewandConfirmPassword(changeForgotPasswordDTO,forgotPasswordDTO);
		if(changePassword) {
		return new ModelAndView("change-password");
		}
		else {
			return new ModelAndView("error");
		}
	}
}
