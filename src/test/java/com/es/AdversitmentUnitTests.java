package com.es;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.es.models.Advertisement;

public class AdversitmentUnitTests {

	private Advertisement adv1;
	
	@Before
	public void setup(){
		adv1 = new Advertisement();
		setupAdv(adv1);
	}
	
	private void setupAdv(Advertisement advertisement) {
		advertisement.setAdvertiser("Anunciante");
		advertisement.setBathroom("2");
		advertisement.setCEP("13444-555");
		advertisement.setCity("Campina Grande");
		advertisement.setEmail("teste@email.com");
		advertisement.setGender("Masculino");
		advertisement.setLat("-799402");
		advertisement.setLon("-3187429");
		advertisement.setNeighborhood("Catolé");
		advertisement.setPhone("3321-2123");
		advertisement.setPrice("R$546,00");
		advertisement.setPropertySize("100M²");
		advertisement.setRating("4");
		advertisement.setRay("5 metros");
		advertisement.setRooms(2);
		advertisement.setState("Paraíba");
		advertisement.setStreet("Floriano peixoto");
		advertisement.setUsername("teste_unit");
	}

	@Test
	public void testAdvertiser() {
		Assert.assertEquals("Anunciante", adv1.getAdvertiser());
		adv1.setAdvertiser("Advertiser");
		Assert.assertEquals("Advertiser", adv1.getAdvertiser());
		Assert.assertNotEquals("Anunciante", adv1.getAdvertiser());
	}

	@Test
	public void testBathroom() {
		Assert.assertEquals("2", adv1.getBathroom());
		adv1.setBathroom("1");
		Assert.assertEquals("1", adv1.getBathroom());
		Assert.assertNotEquals("2", adv1.getBathroom());
	}

	@Test
	public void testCEP() {
		Assert.assertEquals("13444-555", adv1.getCEP());
		adv1.setCEP("22222-333");
		Assert.assertEquals("22222-333", adv1.getCEP());
		Assert.assertNotEquals("13444-555", adv1.getCEP());
	}

	@Test
	public void testEmail() {
		Assert.assertEquals("teste@email.com", adv1.getEmail());
		adv1.setEmail("pessoa@alguem.com");
		Assert.assertEquals("pessoa@alguem.com", adv1.getEmail());
		Assert.assertNotEquals("teste@email.com", adv1.getEmail());
	}

	@Test
	public void testGender() {
		Assert.assertEquals("Masculino", adv1.getGender());
		adv1.setGender("Feminino");
		Assert.assertEquals("Feminino", adv1.getGender());
		Assert.assertNotEquals("João pessoa", adv1.getGender());
	}


	@Test
	public void testLat() {
		Assert.assertEquals("-799402", adv1.getLat());
		adv1.setLat("-855393");
		Assert.assertEquals("-855393", adv1.getLat());
		Assert.assertNotEquals("-799402", adv1.getLat());
	}


	@Test
	public void testLon() {
		Assert.assertEquals("-3187429", adv1.getLon());
		adv1.setLon("-3245566");
		Assert.assertEquals("-3245566", adv1.getLon());
		Assert.assertNotEquals("-3187429", adv1.getLon());
	}

	@Test
	public void testNeighborhood1() {
		Assert.assertEquals("Campina Grande", adv1.getCity());
		adv1.setCEP("João pessoa");
		Assert.assertEquals("Campina Grande", adv1.getCity());
		Assert.assertNotEquals("João pessoa", adv1.getCity());
	}

	@Test
	public void testCity() {
		Assert.assertEquals("Campina Grande", adv1.getCity());
		adv1.setCity("João pessoa");
		Assert.assertNotEquals("Campina Grande", adv1.getCity());
		Assert.assertEquals("João pessoa", adv1.getCity());
	}

	@Test
	public void testNeighborhood() {
		Assert.assertEquals("Catolé", adv1.getNeighborhood());
		adv1.setNeighborhood("Alto Branco");
		Assert.assertEquals("Alto Branco", adv1.getNeighborhood());
		Assert.assertNotEquals("João pessoa", adv1.getNeighborhood());
	}
	@Test
	public void testPhone() {
		Assert.assertEquals("3321-2123", adv1.getPhone());
		adv1.setPhone("3321-2124");
		Assert.assertEquals("3321-2124", adv1.getPhone());
		Assert.assertNotEquals("3321-2123", adv1.getPhone());
	}

	@Test
	public void testPrice() {
		Assert.assertEquals("R$546,00", adv1.getPrice());
		adv1.setPrice("R$500,00");
		Assert.assertEquals("R$500,00", adv1.getPrice());
		Assert.assertNotEquals("R$546,00", adv1.getPrice());
	}

	@Test
	public void testPropertySize() {
		Assert.assertEquals("100M²", adv1.getPropertySize());
		adv1.setPropertySize("150M²");
		Assert.assertEquals("150M²", adv1.getPropertySize());
		Assert.assertNotEquals("100M²", adv1.getPropertySize());
	}

	@Test
	public void testRating() {
		Assert.assertEquals("4", adv1.getRating());
		adv1.setRating("5");
		Assert.assertEquals("5", adv1.getRating());
		Assert.assertNotEquals("4", adv1.getRating());
	}

	@Test
	public void testRay() {
		Assert.assertEquals("5 metros", adv1.getRay());
		adv1.setRay("4 metros");
		Assert.assertEquals("4 metros", adv1.getRay());
		Assert.assertNotEquals("5 metros", adv1.getRay());
	}

	
	@Test
	public void testState() {
		Assert.assertEquals("Paraíba", adv1.getState());
		adv1.setState("Pernambuco");
		Assert.assertEquals("Pernambuco", adv1.getState());
		Assert.assertNotEquals("Paraíba", adv1.getState());
	}

	@Test
	public void testStreet() {
		Assert.assertEquals("Floriano peixoto", adv1.getStreet());
		adv1.setStreet("Manoel Tavares");
		Assert.assertEquals("Manoel Tavares", adv1.getStreet());
		Assert.assertNotEquals("Floriano Peixoto", adv1.getStreet());
	}

	@Test
	public void testUsername() {
		Assert.assertEquals("teste_unit", adv1.getUsername());
		adv1.setUsername("teste");
		Assert.assertEquals("teste", adv1.getUsername());
		Assert.assertNotEquals("teste_unit", adv1.getUsername());
	}
}