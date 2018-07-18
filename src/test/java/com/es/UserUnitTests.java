package com.es;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.es.controllers.UserController;
import com.es.models.User;
import com.es.services.User.UserService;

public class UserUnitTests {

	private User user1;
	private User user2;
	private User user3;


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
		user.setUsername("The_Magician");
		user.setEmail("phil.coutinho@bfc.com");
		user.setCPF("123.456.789-00");
		user.setContact("9999999");
		user.setPassword("12345678");

	}

	@Test
	public void testName() {
		Assert.assertEquals("Phillipe Coutinho", user1.getName());
		user1.setName("Fillipe Coutinho");
		Assert.assertEquals("Fillipe Coutinho", user1.getName());
		Assert.assertNotEquals("Phillipe Coutinho", user1.getName());
	}



	@Test
	public void testUsername() {
		Assert.assertEquals("The_Magician", user1.getUsername());
		Assert.assertNotEquals("Magician", user1.getUsername());
		user1.setUsername("teste_username");
		Assert.assertEquals("teste_username", user1.getUsername());
		Assert.assertNotEquals("The_Magician", user1.getUsername());
	}	

	@Test
	public void testEmail() {
		Assert.assertEquals("phil.coutinho@bfc.com", user1.getEmail());
		Assert.assertNotEquals("phil.coutinho@fmail.com", user1.getEmail());
		user1.setEmail("teste@email.com");
		Assert.assertEquals("teste@email.com", user1.getEmail());
		Assert.assertNotEquals("phil.coutinho@bfc.com", user1.getEmail());


	}

	@Test
	public void testCPF() {
		Assert.assertEquals("123.456.789-00", user1.getCPF());
		Assert.assertNotEquals("000.000.000-00", user1.getCPF());
		user1.setCPF("987.654.321-00");
		Assert.assertEquals("987.654.321-00", user1.getCPF());
		Assert.assertNotEquals("123.456.789-00", user1.getCPF());
	}

	@Test
	public void testContact() {
		Assert.assertEquals("9999999", user1.getContact());
		Assert.assertNotEquals("88888888", user1.getContact());
		user1.setContact("3333333");
		Assert.assertEquals("3333333", user1.getContact());
		Assert.assertNotEquals("9999999", user1.getContact());
	}

	@Test
	public void testPassword() {
		Assert.assertEquals("12345678", user1.getPassword());
		Assert.assertNotEquals("88888888", user1.getPassword());
		user1.setPassword("teste");
		Assert.assertEquals("teste", user1.getPassword());
		Assert.assertNotEquals("12345678", user1.getPassword());
	}


}