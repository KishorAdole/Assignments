package com.service;

import com.dao.UserDao;
import com.dao.UserDaoImplementation;
import com.dto.User;

public class UserServiceImplementation implements UserService {
	
	private UserDao userDao;
	
	public UserServiceImplementation() {
		userDao = new UserDaoImplementation();
	}
	

	@Override
	public int register(User user) {
		return userDao.insertUserDetails(user);
	}

	@Override
	public boolean login(User user) {
		return userDao.login(user);
	}

}
