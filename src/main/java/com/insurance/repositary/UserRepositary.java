package com.insurance.repositary;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.User;

@Repository
public interface UserRepositary extends CrudRepository<User,Serializable>{

public User findById(Integer id);
public List<User> findAll();

}
