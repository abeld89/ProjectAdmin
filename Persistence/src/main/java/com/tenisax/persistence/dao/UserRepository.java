package com.tenisax.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tenisax.persistence.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
