package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.entity.UserEntity;

public class PasswordChangeDAOImpl implements PasswordChangeDAO{
	
	EntityManagerFactory entityManagerFactory;
	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}
	@Override
	public void updatePassword(UserEntity entity,PasswordChangeDTO passwordChangeDTO) {
		EntityManager em=null;
		EntityTransaction et=null;
		
		
		try {
			em = entityManagerFactory.createEntityManager();
		
			et=em.getTransaction();
			et.begin();
			Query query=em.createQuery("UPDATE  UserEntity as update SET update.password= :newpassword WHERE update.email=:email AND update.password=:password");

			query.setParameter("newpassword",passwordChangeDTO.getNewpassword());
			query.setParameter("email",entity.getEmail());
			query.setParameter("password",entity.getPassword());
			query.executeUpdate();
		
			et.commit();
			
			}catch(Exception e) {
				throw e;
	}
}
}