package com.tenisax.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tenisax.persistence.entity.Photo;

@Transactional(propagation=Propagation.REQUIRED, isolation=Isolation.DEFAULT)
public interface PhotoDAO extends JpaRepository<Photo, Long>{

}
