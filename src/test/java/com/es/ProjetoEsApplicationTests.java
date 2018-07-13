package com.es;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.es.controllers.UserController;
import com.es.models.User;
import com.es.services.User.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjetoEsApplicationTests {

	private MockMvc mockMvc;
	@Autowired
	private UserController userController;
	@Mock
	private UserService userService;
	private User user;

	@Before
	public void setup() {
		//userController = new UserController();
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
		user = new User();
		user.setAge(10);
		user.setName("Luca Modric");
		user.setUsername("Don Modric");
		user.setCPF("000.000.000-00");
		user.setEmail("modric@nazi.com");
	}

	@Test
	public void contextLoads() {
	}

	@Test
	public void testUser() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/users")).andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void testPost() throws Exception {
	
		System.out.println(user.toString());
		mockMvc.perform(post("/users")
        .contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(user)));
        
	}
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

}