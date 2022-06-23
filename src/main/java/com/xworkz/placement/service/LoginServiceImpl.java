package com.xworkz.placement.service;


import java.util.Base64;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.placement.dao.LoginDAOImpl;
import com.xworkz.placement.dto.LoginDTO;
import com.xworkz.placement.entity.UserEntity;

@Service
public class LoginServiceImpl implements LoginService{
	
	private final Logger logger = LogManager.getLogger(LoginServiceImpl.class);
	@Autowired
	private LoginDAOImpl logindao;
	@Override
	public UserEntity validateUser(LoginDTO loginDTO) {
		logger.info("INFO - validate user method invoked");

		UserEntity entity=new UserEntity();
		
		if (!loginDTO.getPassword().isEmpty() && !loginDTO.getEmail().isEmpty()) {
			
			BeanUtils.copyProperties(loginDTO, entity);
		} /*
			 * else { return "username and password is null"; }
			 */
	return  logindao.getUserNameandPassword(entity);
	}

}
