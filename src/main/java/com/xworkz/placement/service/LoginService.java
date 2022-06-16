package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.LoginDAO;
import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.dto.RegistrationDTO;

@Service
public class LoginService {
	private final Logger logger=LogManager.getLogger(LoginService.class);
	@Autowired
	private LoginDAO logindao;

	public boolean validateUser(LoginDTO loginDTO) {
		logger.info("INFO - validate user method invoked");
		
			System.out.println(loginDTO.getUsername());
			System.out.println(loginDTO.getPassword());
			if (!loginDTO.getPassword().isEmpty() && !loginDTO.getUsername().isEmpty()) {
				// dao
				
				return true;
			} 
			else {
				return false;		
			}
		
		
		
	}	
	
}
