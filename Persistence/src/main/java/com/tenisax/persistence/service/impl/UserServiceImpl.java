package com.tenisax.persistence.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tenisax.persistence.dao.UserRepository;
import com.tenisax.persistence.exception.UserNotFound;
import com.tenisax.persistence.model.User;
import com.tenisax.persistence.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Resource
	private UserRepository userRepository;
	
	@Override
	@Transactional
	public User create(User user) {
		User userCreated = user;
		return userRepository.save(userCreated);
	}

	@Override
	@Transactional(rollbackFor=UserNotFound.class)
	public User delete(int id) throws UserNotFound {
		User userDelete = userRepository.findOne(id);
		if(null == userDelete){
			throw new UserNotFound();
		}
		userRepository.delete(userDelete);
		return userDelete;
	}

	@Override
	@Transactional
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	@Transactional(rollbackFor=UserNotFound.class)
	public User update(User user) throws UserNotFound {
		User userUpdate = userRepository.findOne(user.getId());
		if(null == userUpdate){
			throw new UserNotFound();
		}
		
		//Si encuentra el usuario actualizamos datos
		userUpdate.setAge(user.getAge());
		userUpdate.setEmail(user.getEmail());
		userUpdate.setEnabled(user.isEnabled());
		userUpdate.setName(user.getName());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setTelephone(user.getTelephone());
		userUpdate.setUsername(user.getUsername());
		
		return userUpdate;
	}

	@Override
	@Transactional
	public User findById(int id) {
		return userRepository.findOne(id);
	}

}
