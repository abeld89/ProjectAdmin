package com.tenisax.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tenisax.persistence.entity.UserRole;

@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
public interface UserRoleDAO extends JpaRepository<UserRole, Long>{

}
