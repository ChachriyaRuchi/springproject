package com.xworkz.placement.dao;

import com.xworkz.placement.dto.ChangeForgotPasswordDTO;
import com.xworkz.placement.entity.UserEntity;

public interface ForgotPasswordDAO {
	
	public boolean checkEmail(UserEntity entity);
	
	public boolean updateNewPasswordByEmail(UserEntity entity,ChangeForgotPasswordDTO changeForgotPasswordDTO);
}
