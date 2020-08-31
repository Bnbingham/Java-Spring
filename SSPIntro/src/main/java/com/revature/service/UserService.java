package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.dao.UserDao;
import com.revature.entity.User;

@Service
public class UserService {

	
	@Autowired
	UserDao userDao;
	
	public List<User> getAllUsers(){
		return this.userDao.findAll();
	}
	public User addUser(User user) {
		return this.userDao.save(user);
	}
}
