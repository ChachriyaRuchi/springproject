package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.placement.dto.RegistrationDTO;

public class RegistrationDAOImpl{
	EntityManagerFactory entityManagerFactory;
	EntityManager em = null;
	EntityTransaction transaction=null;

	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}


	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}


	public void saveData(RegistrationDTO registrationDTO) {
		try {
		em=entityManagerFactory.createEntityManager();
		transaction=em.getTransaction();
		transaction.begin();
		em.persist(registrationDTO);
		transaction.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			
			if(em!=null) {
				em.close();
			}
			if(transaction!=null) {
				transaction.rollback();
			}
			
		}
		
	}

}
