package com.xworkz.placement.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.xworkz.placement.constants.Gender;
import com.xworkz.placement.utility.PasswordGenerate;

import lombok.Data;
@Data
@Entity
@Table(name="registration")
public class RegistrationDTO {
	@Id
	@GenericGenerator(name = "pkvalue", strategy = "increment")
	@GeneratedValue(generator ="pkvalue" )
	private int id;	
	private String name;
	private String email;
	private double phonenumber;
	private Gender gender;
	private PasswordGenerate password;
	
}
