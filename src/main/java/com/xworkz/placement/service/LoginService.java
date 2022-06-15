package com.xworkz.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.LoginDAO;
import com.xworkz.placement.dto.LoginDTO;

@Service
public class LoginService {
	
	@Autowired
	private LoginDAO logindao;

	public boolean validateUser(LoginDTO loginDTO) {
		System.out.println(loginDTO.getUsername());
		System.out.println(loginDTO.getPassword());
		if (!loginDTO.getPassword().isEmpty() && !loginDTO.getUsername().isEmpty()) {
			// dao
			
			return true;
		} else {
			return false;
		}
	}
}
