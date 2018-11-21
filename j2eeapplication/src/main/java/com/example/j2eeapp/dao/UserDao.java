package com.example.j2eeapp.dao;

import com.example.j2eeapp.commons.dao.GenericDao;
import com.example.j2eeapp.domain.UserEntity;

/**
 * Data access object interface to work with User entity database operations.
 * 
 * @author hjordao
 */
public interface UserDao extends GenericDao<UserEntity, Long> {

	/*
	 * Queries database for username availability
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
	 * @return User Entity
	 * 
	 */
	UserEntity loadUserByUserName(String userName);
}
