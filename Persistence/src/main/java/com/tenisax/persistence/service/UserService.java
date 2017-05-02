package com.tenisax.persistence.service;

import java.util.List;

import com.tenisax.persistence.exception.UserNotFound;
import com.tenisax.persistence.model.User;

public interface UserService {
	
	public User create(User user);
	public User delete(int id) throws UserNotFound;
	public List<User> findAll();
	public User update(User user) throws UserNotFound;
	public User findById(int id);
}
