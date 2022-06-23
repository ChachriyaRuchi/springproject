package com.xworkz.placement.service;

import com.xworkz.placement.dto.ChangeForgotPasswordDTO;
import com.xworkz.placement.dto.ForgotPasswordDTO;
import com.xworkz.placement.entity.UserEntity;

public interface ForgotPasswordService {
	
	public boolean checkEmail(ForgotPasswordDTO forgotPasswordDTO);
	
	public boolean verifyNewandConfirmPassword(ChangeForgotPasswordDTO changeForgotPasswordDTO,ForgotPasswordDTO forgotPasswordDTO);
}
