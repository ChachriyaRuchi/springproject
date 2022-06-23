package com.xworkz.placement.service;

import java.util.Base64;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.RegistrationDAO;
import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;
import com.xworkz.placement.util.PasswordGenerate;

@Service
public class RegistrationService {
	private final Logger logger = LogManager.getLogger(RegistrationService.class);

	@Autowired
	private RegistrationDAO registrationDao;

	public boolean saveData(RegistrationDTO registrationDTO) throws Exception {
		logger.info("INFO - save data registration service method invoked");
		
		UserEntity entity = new UserEntity();
		
		BeanUtils.copyProperties(registrationDTO, entity);
		String password=PasswordGenerate.randomPassword();
		//String originalInput=entity.getPassword();
		String encodedPassword=Base64.getEncoder().encodeToString(password.getBytes());
		entity.setPassword(encodedPassword);
		System.out.println("Your password is:" +password);
		return registrationDao.saveData(entity);
	}
}
