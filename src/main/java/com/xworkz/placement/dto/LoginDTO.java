package com.xworkz.placement.dto;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="login")
public class LoginDTO {
	
	private String username;
	private String password;
	

	
	
}
