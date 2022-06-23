package com.xworkz.placement.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xworkz.placement.dto.ChangeForgotPasswordDTO;
import com.xworkz.placement.entity.UserEntity;

@Repository
public class ForgotPasswordDAOImpl implements ForgotPasswordDAO{

	EntityManagerFactory entityManagerFactory;
	
	
	
	public EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	@Autowired
	public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
		this.entityManagerFactory = entityManagerFactory;
	}

	public boolean checkEmail(UserEntity entity) {
		EntityManager entityManager=null;
		String get="SELECT email FROM UserEntity as entity WHERE entity.email=:email";
		boolean check=false;
		try {
			entityManager=entityManagerFactory.createEntityManager();
			Query query=entityManager.createQuery(get);
			query.setParameter("email", entity.getEmail());
			query.getSingleResult();
			check=true;
			
		} catch (Exception e) {
			throw e;
		}
		return check;
	}
	@Override
	public boolean updateNewPasswordByEmail(UserEntity entity,ChangeForgotPasswordDTO changeForgotPasswordDTO) {
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		String get="UPDATE UserEntity as entity SET entity.password=:password WHERE entity.email=:email";
		boolean check=false;
		try {
			entityManager=entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			Query query=entityManager.createQuery(get);
			query.setParameter("password",changeForgotPasswordDTO.getConfirmpassword());
			query.setParameter("email", entity.getEmail());
			query.executeUpdate();
			check=true;
			
		} catch (Exception e) {
			throw e;
		}
		return check;
	}
}
