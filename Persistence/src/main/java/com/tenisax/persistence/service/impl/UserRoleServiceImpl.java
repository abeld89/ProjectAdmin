package com.tenisax.persistence.service.impl;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.tenisax.persistence.dao.UserRoleDAO;
import com.tenisax.persistence.dto.UserRoleDTO;
import com.tenisax.persistence.entity.UserRole;
import com.tenisax.persistence.exception.UserNotFound;
import com.tenisax.persistence.mapper.Mapper;
import com.tenisax.persistence.service.UserRoleService;
import com.tenisax.persistence.service.ext.Constantes;

public class UserRoleServiceImpl implements UserRoleService{

	private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserRoleDAO userRoleDAO;
	
	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserRoleService#saveRole(com.tenisax.persistence.dto.UserRoleDTO)
	 */
	@Override
	public UserRoleDTO saveRole(UserRoleDTO role) throws UserNotFound {
		Mapper<UserRoleDTO, UserRole> mapper = new Mapper<>(UserRoleDTO.class, UserRole.class);
		UserRoleDTO userRoleDTO = null;
		try{
			UserRole entidadUser = userRoleDAO.saveAndFlush(mapper.mapDTO2Entidad(role));
			userRoleDTO = mapper.mapEntidad2DTO(entidadUser);
		}catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e){
			LOGGER.error("Error parseando entidad y dto", e);
			throw new UserNotFound(Constantes.ERROR_TABLE_USERS_ROLE + ", parseando entidad a DTO, operación saveUser");
		}
		return userRoleDTO;
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserRoleService#delete(com.tenisax.persistence.dto.UserRoleDTO)
	 */
	@Override
	public void delete(UserRoleDTO role) throws UserNotFound {
		Mapper<UserRoleDTO, UserRole> mapper = new Mapper<>(UserRoleDTO.class, UserRole.class);
		try{
			userRoleDAO.delete(mapper.mapDTO2Entidad(role));
		}catch(InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e){
			LOGGER.error("Error parseando entidad y dto", e);
			throw new UserNotFound(Constantes.ERROR_TABLE_USERS_ROLE + ", parseando entidad a DTO, operación delete");
		}
		
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserRoleService#findAll()
	 */
	@Override
	public List<UserRoleDTO> findAll() {
		List<UserRole> listaRole = userRoleDAO.findAll();
		List<UserRoleDTO> listaRoleDTO = null;
		
		for(UserRole role: listaRole){
			
			Mapper<UserRoleDTO,UserRole> mapper = new Mapper<>(UserRoleDTO.class, UserRole.class);
			try {
				listaRoleDTO.add(mapper.mapEntidad2DTO(role));
			}catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| IntrospectionException e) {
				LOGGER.error("Error parseando entidad y dto", e);
			}
		}
		
		return listaRoleDTO;
	}

	/*
	 * (non-Javadoc)
	 * @see com.tenisax.persistence.service.UserRoleService#findById(java.lang.Long)
	 */
	@Override
	public UserRoleDTO findById(Long id) {
		UserRole role = userRoleDAO.findOne(id);
		UserRoleDTO roleDTO = null;
		Mapper<UserRoleDTO,UserRole> mapper = new Mapper<>(UserRoleDTO.class, UserRole.class);
		try {
			roleDTO = mapper.mapEntidad2DTO(role);
		}catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| IntrospectionException e) {
			LOGGER.error("Error parseando entidad y dto", e);
		}
		
		return roleDTO;
	}

}
