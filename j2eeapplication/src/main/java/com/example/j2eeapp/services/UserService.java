package com.example.j2eeapp.services;

import com.example.j2eeapp.domain.UserEntity;

public interface UserService {

	/*
	 * Create user - persist to database
	 *
	 * @param userEntity
	 * @return true if success
	 * 
	 */
	boolean createUser(UserEntity userEntity);
}
