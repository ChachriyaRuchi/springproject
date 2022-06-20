package com.xworkz.placement.dao;

import com.xworkz.placement.entity.UserEntity;

public interface RegistrationDAO {
	public boolean saveData(UserEntity userEntity) throws Exception;
	
}
