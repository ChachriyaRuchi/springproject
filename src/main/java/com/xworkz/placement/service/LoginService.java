package com.xworkz.placement.service;

import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.entity.UserEntity;

public interface LoginService {

	public UserEntity validateUser(LoginDTO loginDTO);
}
