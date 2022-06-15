package com.xworkz.placement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.placement.constants.Gender;

import lombok.Data;
@Data
public class RegistrationDTO {
	
	private String name;
	private String email;
	private Long phonenumber;
	private Gender gender;
	private String password;
	
}
