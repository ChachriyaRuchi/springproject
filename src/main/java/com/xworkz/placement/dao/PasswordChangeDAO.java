package com.xworkz.placement.dao;

import com.xworkz.placement.dto.PasswordChangeDTO;
import com.xworkz.placement.entity.UserEntity;

public interface PasswordChangeDAO {

	public void updatePassword(UserEntity entity,PasswordChangeDTO passwordChangeDTO);
}
