package com.xworkz.placement.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.xworkz.placement.dao.RegistrationDAOImpl;

import lombok.Data;

@Data
public class LoginDTO {
	private final Logger logger=LogManager.getLogger(LoginDTO.class);
	private String username;
	private String password;
	
	
	
}
