package com.xworkz.placement.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.RegistrationDAOImpl;
import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;

@Service
public class RegistrationService {
	private final Logger logger=LogManager.getLogger(RegistrationService.class);

	@Autowired
	private RegistrationDAOImpl registrationDao;
	
	public void saveData(RegistrationDTO registrationDTO) {
		logger.info("INFO - save data registration service method invoked");
		UserEntity entity = new UserEntity(); 
		 BeanUtils.copyProperties(registrationDTO, entity);
		 logger.info("INFO - login method invoked");
			try {
				registrationDao.saveData(entity);
				throw new Exception("Exception occurs");
			}catch(Exception e) {
				logger.error(e.getMessage(),e);
			}
			
		
	}
}
