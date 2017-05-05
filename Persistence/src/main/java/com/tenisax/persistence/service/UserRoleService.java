package com.tenisax.persistence.service;

import java.util.List;

import com.tenisax.persistence.dto.UserRoleDTO;
import com.tenisax.persistence.exception.UserNotFound;

public interface UserRoleService {

	/**
	 * Guarda o actualiza un role
	 * @param user
	 * @return
	 * @throws UserNotFound
	 */
	UserRoleDTO saveRole(UserRoleDTO role) throws UserNotFound;
	
	/**
	 * Borra un role
	 * @param role
	 * @throws UserNotFound
	 */
	void delete(UserRoleDTO role) throws UserNotFound;
	
	/**
	 * Lista todos los role
	 * @return
	 */
	List<UserRoleDTO> findAll();
	
	/**
	 * Busca un role por id
	 * @param id
	 * @return
	 */
	UserRoleDTO findById(Long id);
	
	
}
