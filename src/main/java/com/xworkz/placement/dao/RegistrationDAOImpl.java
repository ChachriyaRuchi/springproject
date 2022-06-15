package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.placement.dto.RegistrationDTO;
import com.xworkz.placement.entity.UserEntity;
@Repository
public class RegistrationDAOImpl{
	@Autowired
	EntityManagerFactory entityManagerFactory;
	

	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}


	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}


	public void saveData(UserEntity entity) {
		EntityManager em = null;
		EntityTransaction transaction=null;
		try {
		em=entityManagerFactory.createEntityManager();
		transaction=em.getTransaction();
		transaction.begin();
		em.persist(entity);
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
