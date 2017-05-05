package com.tenisax.persistence.test;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tenisax.persistence.dao.UserDAO;
import com.tenisax.persistence.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:META-INF/spring/BeanContext.xml",
		"classpath:META-INF/spring/DatabaseH2Context.xml",
		"classpath:META-INF/spring/TransactionManagerContext.xml"})
public class TestUser {

	@Autowired
	private UserDAO userDAO;
	
	@Test
	public void findAll(){
		Date now = new Date();
		Timestamp timeStamp=new Timestamp(now.getTime());
		User user = new User();
		user.setName("Prueba");
		user.setEmail("Prueba@email.com");
		user.setEnabled(true);
		user.setPassword("passowrd");
		user.setUsername("username");
		user.setTelephone("telephono666");
		user.setAge(99L);
		user.setentryDate(timeStamp);
		
		userDAO.saveAndFlush(user);
		
		List<User> usuarios = userDAO.findAll();
		
		Assert.assertTrue("Usuarios no encontrados", usuarios.size()>0);
	}
	
}
