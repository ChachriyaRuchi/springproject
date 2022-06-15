package com.xworkz.placement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.RegistrationDAOImpl;
import com.xworkz.placement.entity.UserEntity;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationDAOImpl registrationDao;
	
	public void persist(UserEntity entity) {
		registrationDao.saveData(entity);
	}
}
