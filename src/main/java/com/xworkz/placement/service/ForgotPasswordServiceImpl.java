package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.ForgotPasswordDAO;
import com.xworkz.placement.dto.ChangeForgotPasswordDTO;
import com.xworkz.placement.dto.ForgotPasswordDTO;
import com.xworkz.placement.entity.UserEntity;

@Service
public class ForgotPasswordServiceImpl implements ForgotPasswordService{
	
	Logger logger=LogManager.getLogger(ForgotPasswordServiceImpl.class);
			
	@Autowired
	private ForgotPasswordDAO forgotPasswordDAO;
	
	UserEntity entity=null;
	
	@Override
	public boolean checkEmail(ForgotPasswordDTO forgotPasswordDTO) {
		boolean temp=false;
	
		if (forgotPasswordDTO.getEmail() != null && !forgotPasswordDTO.getEmail().isEmpty() && forgotPasswordDTO.getEmail().length() <= 40) {
			BeanUtils.copyProperties(forgotPasswordDTO, entity);
			forgotPasswordDAO.checkEmail(entity);
			temp=true;
			return temp;
		}
		else {
			logger.info("envalid email");
		}
		return temp;
	}

	@Override
	public boolean verifyNewandConfirmPassword(ChangeForgotPasswordDTO changeForgotPasswordDTO,ForgotPasswordDTO forgotPasswordDTO) {
		boolean check=false;
		boolean checkPasswords=changeForgotPasswordDTO.getNewpassword().equals(changeForgotPasswordDTO.getConfirmpassword());
		if(checkPasswords) {
			BeanUtils.copyProperties(forgotPasswordDTO, entity);
			forgotPasswordDAO.updateNewPasswordByEmail(entity,changeForgotPasswordDTO);
			check=true;
			return check;
		}
		else {
			logger.info("password doesn't match");
		}
		
		return check;
	}
	
}
