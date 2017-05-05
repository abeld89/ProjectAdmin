package com.tenisax.persistence.service.impl;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tenisax.persistence.dao.UserDAO;
import com.tenisax.persistence.dto.UserDTO;
import com.tenisax.persistence.entity.User;
import com.tenisax.persistence.exception.UserNotFound;
import com.tenisax.persistence.mapper.Mapper;
import com.tenisax.persistence.service.UserService;
import com.tenisax.persistence.service.ext.Constantes;

public class UserServiceImpl implements UserService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	
	@Autowired
	private UserDAO userDAO;

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserService#saveUser(com.tenisax.persistence.dto.UserDTO)
	 */
	@Override
	public UserDTO saveUser(UserDTO user) throws UserNotFound {
		Mapper<UserDTO, User> mapper = new Mapper<>(UserDTO.class, User.class);
		UserDTO userDTO = null;
		try{
			User entidadUser = userDAO.saveAndFlush(mapper.mapDTO2Entidad(user));
			userDTO = mapper.mapEntidad2DTO(entidadUser);
		}catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e){
			LOGGER.error("Error parseando entidad y dto", e);
			throw new UserNotFound(Constantes.ERROR_TABLE_USERS + ", parseando entidad a DTO, operación saveUser");
		}
		return userDTO;
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserService#delete(int)
	 */
	@Override
	public void delete(UserDTO user) throws UserNotFound {
		Mapper<UserDTO,User> mapper = new Mapper<>(UserDTO.class, User.class);
		try {
			userDAO.delete(mapper.mapDTO2Entidad(user));
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e) {
			LOGGER.error("Error parseando entidad y dto", e);
			throw new UserNotFound(Constantes.ERROR_TABLE_USERS + ", parseando entidad a DTO, operación DELETE");
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserService#findAll()
	 */
	@Override
	public List<UserDTO> findAll() {
		List<User> listaUser = userDAO.findAll();
		List<UserDTO> listaUserDTO = null;
		
		for(User user: listaUser){
			
			Mapper<UserDTO,User> mapper = new Mapper<>(UserDTO.class, User.class);
			try {
				listaUserDTO.add(mapper.mapEntidad2DTO(user));
			}catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| IntrospectionException e) {
				LOGGER.error("Error parseando entidad y dto", e);
			}
		}
		
		return listaUserDTO;
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserService#findById(int)
	 */
	@Override
	public UserDTO findById(Long id) {
		User user = userDAO.findOne(id);
		UserDTO userDTO = null;
		Mapper<UserDTO,User> mapper = new Mapper<>(UserDTO.class, User.class);
		try {
			userDTO = mapper.mapEntidad2DTO(user);
		}catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e) {
			LOGGER.error("Error parseando entidad y dto", e);
		}
		
		return userDTO;
	}
	
}
