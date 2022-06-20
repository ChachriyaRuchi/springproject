package com.xworkz.placement.dao;

import java.util.Base64;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;

@Repository
public class RegistrationDAOImpl implements RegistrationDAO {
	
	private EntityManagerFactory entityManagerFactory;

	private final Logger logger = LogManager.getLogger(RegistrationDAOImpl.class);

	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	@Override
	public boolean saveData(UserEntity entity) throws Exception {
		EntityManager em = null;
		EntityTransaction transaction = null;
		boolean saveStatus = false;
		
		logger.info("INFO- save method of registrationdao invoked");
		try {
			em = entityManagerFactory.createEntityManager();
			transaction = em.getTransaction();
			transaction.begin();
			em.persist(entity);
			transaction.commit();
			saveStatus = true;
		} catch (Exception e) {
			throw e;
		}
		return saveStatus;
	}
	

}
