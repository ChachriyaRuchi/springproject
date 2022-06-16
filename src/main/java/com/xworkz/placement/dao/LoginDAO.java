package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.placement.controller.RegistrationController;

@Repository
public class LoginDAO {
	private final Logger logger=LogManager.getLogger(LoginDAO.class);
	
	@Autowired
	EntityManagerFactory entityManagerFactory;

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	
	public void saveData() {
		logger.info("INFO - login method invoked");
		
	}
	
}
