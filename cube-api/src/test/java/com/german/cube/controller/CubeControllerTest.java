package com.german.cube.controller;

import com.german.cube.controller.controller.CubeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CubeController.class)
public class CubeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldSetCubeDimension4x4x4() throws Exception {
	    mockMvc.perform(post("/cube/4"))
                .andExpect(status().isCreated());
	}

}
