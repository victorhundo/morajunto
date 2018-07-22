package com.es;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
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

import com.es.controllers.AdvertisementController;
import com.es.models.Advertisement;
import com.es.services.Advertisement.AdvertisementService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdvertisementIntegrationTests {

	private MockMvc mockMvc;
	@Autowired
	private AdvertisementController advController;
	@Mock
	private AdvertisementService advService;
	private Advertisement adv;
	

	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(advController).build();
		
		adv = new Advertisement();
		
		
	}

	@Test
	public void contextLoads() {
	}

	@SuppressWarnings("unchecked")
	@Test
	public void testGet_adv() throws Exception {
		this.mockMvc.perform(MockMvcRequestBuilders.get("/api/advertisements")).andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
	}
	
	@Test
	public void testPostAdv() throws Exception {
	
		mockMvc.perform(post("/api/advertisements")
        .contentType(MediaType.APPLICATION_JSON)
        .content(asJsonString(adv))).andExpect(status().isOk());
		
		verify(advService, times(0)).getByUsername(adv.getUsername());
		verifyNoMoreInteractions(advService);
        
	}
	
	@Test
	public void adv_test_get_by_id_success() throws Exception {
	   // when(advService.getByUsername("teste2")).thenReturn(user);
	    mockMvc.perform(get("/api/advertisements/{id}", "5b4b421a8963c122b4e2a91b"))
	            .andExpect(status().isOk())
	            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE));
	    verify(advService, times(0)).getByUsername("teste2");
	    verifyNoMoreInteractions(advService);
	}
	
	@Test
	public void test_get_by_adv_id_fail_404_not_found() throws Exception {
	   when(advService.getById("teste1")).thenReturn(null);
	    this.mockMvc.perform(get("api/advertisements/{id}",1)).andExpect(status().isNotFound());
	    verify(advService, times(0)).getById("teste1");
	    verifyNoMoreInteractions(advService);
	}
	
	@Test
	public void test_delete_adv_success() throws Exception {
	 
	    //when(advService.getById(adv.getId())).thenReturn(adv);
	    doNothing().when(advService).delete(adv);
	    mockMvc.perform(
	            delete("api/advertisements/{id}", 1))
	            .andExpect(status().isNotFound());
	    verify(advService, times(0)).getById(adv.getId());
	    verify(advService, times(0)).delete(adv);
	    verifyNoMoreInteractions(advService);
	}
	
	
	
	public static String asJsonString(final Object obj) {
	    try {
	        return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	        throw new RuntimeException(e);
	    }
	}

}