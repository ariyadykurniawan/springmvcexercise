package com.example;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeTests {
	private MockMvc mockMvc;
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.standaloneSetup(new EmployeesController()).build();
	}
	
	@Test
	public void checkGet() throws Exception {
		String result = "[{\"name\":\"ariyady\",\"gender\":\"male\",\"id\":1}]";
	    this.mockMvc.perform(get("/employees?gender=male"))
	        .andExpect(content().json(result));
	}
	
	@Test
	public void checkPost() throws Exception{
		this.mockMvc.perform(post("/employees")
				.content("{\"name\":\"james\",\"gender\":\"male\",\"id\":1}")
				.contentType("application/json"))
		.andExpect(status().isOk());
	}
	
	@Test
	public void checkGetDet() throws Exception{
		this.mockMvc.perform(get("/employee/3")).andExpect(status().isNotFound());
	}
}
