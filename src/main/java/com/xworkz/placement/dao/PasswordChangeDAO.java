package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.entity.UserEntity;

public class PasswordChangeDAO {
	
	EntityManagerFactory entityManagerFactory;
	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	PasswordChangeDTO changeDTO;
	public void updatePassword(UserEntity entity) {
		EntityManager em=null;
		EntityTransaction et=null;
		
		
		try {
			em = entityManagerFactory.createEntityManager();
		
			et=em.getTransaction();
			et.begin();
			Query query=em.createQuery("UPDATE  UserEntity SET password= :newpassword WHERE email=:email AND password=:password");
			query.setParameter("newpassword",changeDTO.getNewpassword());
			query.setParameter("email",entity.getEmail());
			query.setParameter("password",entity.getPassword());
			query.executeUpdate();
		
			et.commit();
			
			}catch(Exception e) {
				throw e;
	}
}
}