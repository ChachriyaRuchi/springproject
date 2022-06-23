package com.xworkz.placement.dao;

import java.util.Base64;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.xworkz.placement.controller.RegistrationController;
import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.entity.UserEntity;

@Repository
public class LoginDAOImpl implements LoginDAO{
	
	private final Logger logger=LogManager.getLogger(LoginDAOImpl.class);
	
	EntityManagerFactory entityManagerFactory;

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	@Override
	public UserEntity getUserNameandPassword(UserEntity entity) {
		EntityManager entityManager=null;
		UserEntity userEntity =null;
		String get="FROM UserEntity as login WHERE login.email=:email AND login.password=:password";
		logger.info("INFO - login method invoked");
		
		String originalInput=entity.getPassword();
		String encodedPassword=Base64.getEncoder().encodeToString(originalInput.getBytes());
		logger.info("Encrypted Password for {} is {}",originalInput,encodedPassword);
		try {
			entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery(get);
			query.setParameter("email", entity.getEmail());
			query.setParameter("password", encodedPassword);
			userEntity = (UserEntity) query.getSingleResult();
		}catch(Exception e) {
			throw e;
		}
		return userEntity;
		}
	}
	

