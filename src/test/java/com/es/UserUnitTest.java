package com.es;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.es.controllers.UserController;
import com.es.models.User;
import com.es.services.User.UserService;
import com.es.services.User.UserServiceImpl;

public class UserUnitTest {

	private User user1;
	private User user2;
	private User user3;
	private UserService userService;
	private UserController userController;

	@Before
	public void setup() {
		user1 = new User();
		user2 = new User();
		user3 = new User();
		setupUser1(user1);
		setupUser2(user2);
		setupUser3(user3);
	}

	private void setupUser3(User user) {
		user.setName("Oribe Peralta");
		user.setAge(33);
		user.setUsername("El Pirillo");
		user.setEmail("oribe@mx.com");
		user.setCPF("123.456.789-00");
		user.setContact("Av. San Jerónimo,Lidice, CDMX - MX");

	}

	private void setupUser2(User user) {
		user.setName("Marcelinho Paraíba");
		user.setAge(43);
		user.setUsername("MPB10");
		user.setEmail("mpb10@treze.com");
		user.setCPF("123.456.789-00");
		user.setContact("Campos Sales, 314, José Pinheiro, Campina Grande - PB");
		;

	}

	private void setupUser1(User user) {
		user.setName("Phillipe Coutinho");
		user.setAge(25);
		user.setUsername("The Magician");
		user.setEmail("phil.coutinho@bfc.com");
		user.setCPF("123.456.789-00");
		user.setContact("9999999");

	}

	@Test
	public void testName() {
		Assert.assertEquals("Phillipe Coutinho", user1.getName());
		Assert.assertNotEquals("Phillip Coutinho", user1.getName());
		Assert.assertEquals("Marcelinho Paraíba", user2.getName());
		Assert.assertNotEquals("Marcelinho Paraiba", user2.getName());
		

	}

	@Test
	public void testUsername() {
		Assert.assertEquals("The Magician", user1.getUsername());
		Assert.assertNotEquals("O Mágico", user1.getUsername());
		Assert.assertEquals("MPB10",user2.getUsername());
		Assert.assertNotEquals("MPB1",user2.getUsername());
	}
	
	@Test
	public void testUserNull(){
		User user4 = null;
		Assert.assertNull(user4);
		user4 = new User();
		Assert.assertNotNull(user4);
	}
	
	

}
