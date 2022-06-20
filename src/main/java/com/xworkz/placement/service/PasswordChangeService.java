package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.placement.dao.PasswordChangeDAO;
import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.entity.UserEntity;

public class PasswordChangeService {
	private final Logger logger = LogManager.getLogger(RegistrationService.class);

	@Autowired
	PasswordChangeDAO changeDAO;
	
	public void changePassword(PasswordChangeDTO passwordChangeDTO) {
		
		
		UserEntity entity = new UserEntity();
		if (passwordChangeDTO.getNewpassword()==passwordChangeDTO.getConfirmpassword()) {
		BeanUtils.copyProperties(passwordChangeDTO, entity);
		changeDAO.updatePassword(entity);
		}
		else {
			new Exception("password doesn't match");
		}
	}
}
