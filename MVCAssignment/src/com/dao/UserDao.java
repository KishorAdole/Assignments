package com.dao;

import com.dto.User;

public interface UserDao {
	
	int insertUserDetails(User user);
	boolean login(User user);
	
}
