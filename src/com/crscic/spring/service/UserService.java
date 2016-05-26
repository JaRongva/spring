package com.crscic.spring.service;

import com.crscic.spring.dao.UserDao;
import com.crscic.spring.entity.User;

public class UserService {
	private UserDao userDao;
	
	public void add(String name){
		User u = new User();
		u.setName(name);
		userDao.add(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
