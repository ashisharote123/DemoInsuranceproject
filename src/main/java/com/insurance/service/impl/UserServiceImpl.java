package com.insurance.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.User;
import com.insurance.repositary.UserRepositary;
import com.insurance.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
private UserRepositary userRepositary;
	@Override
	public User addUser(User user) {
		User users=userRepositary.save(user);
		return users;
	}
	@Override
	public User updateUser(User user) {
		User user1=userRepositary.save(user);
		return user1;
	}
	@Override
	public User getUser(Integer id) {
		
			User user=userRepositary.findById(id);
 return user;
}
	public List<User> getAllUser() {
		List<User> user=userRepositary.findAll();
		return user;
	}
	@Override
	public void deleteUser(Integer id) {
		userRepositary.deleteById(id);
		
	}
}
