package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.UserDao;
@Service
public class UserService {
	@Autowired(required=true)
	private UserDao userDao;
/*
	public List<UserDetails> getUserDetails() {
		return userDao.getUserDetails();
	}*/
}
