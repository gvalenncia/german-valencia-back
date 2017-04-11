package com.german.cube.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by gvalenncia on 4/11/17.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class CubeServiceTest {

    @Autowired
    private CubeService cubeService;

    @Test
    public void shouldCreateACubeDimension5x5x5(){
        cubeService.createCube(5);
        Assert.assertEquals(5, cubeService.getCubeSize());
    }
}
