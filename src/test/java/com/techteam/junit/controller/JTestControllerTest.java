package com.techteam.junit.controller;



import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
public class JTestControllerTest {
	
	/**
	 * 4. Create MockMvc to test the end point
	 */
	private MockMvc mockMvc;
	
	/**
	 * 1. Create an instance of class you want to test
	 * and annotate with InjectMock
	 */
	
	@InjectMocks
	private JTestController jTestController;
	
	/**
	 * 2. create a setup method
	 */
	@Before
	public void setUp() throws Exception{
		//create an instance of MockMvc
		mockMvc = MockMvcBuilders.standaloneSetup(jTestController)
				.build();
		
	}
	
	/**
	 * 3. Write the test method
	 */
	@Test
	public void testGetMessage() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/msg1"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Hello"));
		
	}
	
	@Test
	public void testGetMessage2() throws Exception{
		mockMvc.perform(MockMvcRequestBuilders.get("/msg2"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath("$.name", Matchers.is("shafat")));
		
	}

}
