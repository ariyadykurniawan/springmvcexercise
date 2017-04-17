package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringdemoApplicationTests {
	private MockMvc mockMvc;

	/*@Test
	public void contextLoads() {
		
		
	}*/
	
	@Before
	public void setup(){
		this.mockMvc = MockMvcBuilders.standaloneSetup(new HelloWorldController()).build();
	}
	
	@Test
	public void getMessage() throws Exception {
	    this.mockMvc.perform(get("/helloget?message=helloget"))
	        .andExpect(status().isOk());
	}
	
	@Test
	public void getMessagePut() throws Exception {
	    this.mockMvc.perform(put("/helloput/pesanput"))
	        .andExpect(status().isOk());
	}

}
