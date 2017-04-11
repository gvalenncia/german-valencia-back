package com.german.cube.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.german.cube.model.Block;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
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

    @Test
    public void shouldUpdateCubeBlock2x1x2() throws Exception {
	    ObjectMapper mapper = new ObjectMapper();
        Block blockRequest = new Block(2,1,2, 15);

        mockMvc.perform(put("/cube")
                .contentType(MediaType.APPLICATION_JSON_UTF8)
                .content(mapper.writeValueAsString(blockRequest)))
                .andExpect(status().isOk());
    }
}
