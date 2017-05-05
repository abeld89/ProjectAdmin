package com.tenisax.persistence.service;

import java.util.List;

import com.tenisax.persistence.dto.UserDTO;
import com.tenisax.persistence.exception.UserNotFound;

public interface UserService {
	
	/**
	 * Guarda o actualiza en BBDD el usuario pasado por parámetro
	 * @param user
	 * @return
	 * @throws UserNotFound
	 */
	UserDTO saveUser(UserDTO user) throws UserNotFound;
	
	/**
	 * Borra de BBDD el usuario pasado por parámetro
	 * @param id
	 * @throws UserNotFound
	 */
	void delete(UserDTO user) throws UserNotFound;
	
	/**
	 * Devuelve todos los usuarios registrados
	 * @return
	 */
	List<UserDTO> findAll();
	
	/**
	 * Devuelve el usuario pasado por parámetro
	 * @param id
	 * @return
	 */
	UserDTO findById(Long id);
}
