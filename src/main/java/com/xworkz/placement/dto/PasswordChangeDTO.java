package com.xworkz.placement.dto;

import lombok.Data;
@Data
public class PasswordChangeDTO {
	
	private String password;
	private String newpassword;
	private String confirmpassword;
}
