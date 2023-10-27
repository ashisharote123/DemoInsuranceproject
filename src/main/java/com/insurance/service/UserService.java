package com.insurance.service;

import java.util.List;

import com.insurance.model.User;

public interface UserService {
public User addUser(User user);//134
public User updateUser(User user);//135
public User getUser(Integer id);//136
public List<User> getAllUser();//137
public void deleteUser(Integer id);
}
