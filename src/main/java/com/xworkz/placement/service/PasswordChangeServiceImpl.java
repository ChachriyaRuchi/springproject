package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.placement.dao.PasswordChangeDAOImpl;
import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.entity.UserEntity;

public class PasswordChangeServiceImpl implements PasswordChangeService {
	private final Logger logger = LogManager.getLogger(PasswordChangeServiceImpl.class);

	@Autowired
	PasswordChangeDAOImpl changeDAO;
	@Override
	public void changePassword(PasswordChangeDTO passwordChangeDTO) {
		
		
		UserEntity entity = new UserEntity();
		if (passwordChangeDTO.getNewpassword()==passwordChangeDTO.getConfirmpassword()) {
	//	BeanUtils.copyProperties(passwordChangeDTO, entity);
		changeDAO.updatePassword(entity, passwordChangeDTO);
		}
		else {
			new Exception("password doesn't match");
		}
	}
}
