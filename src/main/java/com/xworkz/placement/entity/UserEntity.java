package com.xworkz.placement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.placement.constants.Gender;

import lombok.Data;
@Data
@Entity
@Table(name="userinfo")
public class UserEntity {
	
	/* private final Logger logger=LogManager.getLogger(UserEntity.class); */

       @Id
       @GenericGenerator(name = "pkvalue", strategy = "increment")
       @GeneratedValue(generator ="pkvalue" ) 
 		private int id;
 		private String name;
		private String email;
		private Long phonenumber;
		private Character gender;
		private String password;
		
	}

