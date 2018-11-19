package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.UserEntity;

public interface UserDao extends GenericDao<UserEntity, Long>{

	/*
	 * queries database for userName availability
	 *
	 * @param userName
	 * @return true if available
	 * 
	 */
	boolean checkAvailable(String userName);
	
	/*
	 * queries user by username
	 *
	 * @param userName
	 * @return user
	 * 
	 */
	UserEntity loadUserByUserName(String userName);
}
