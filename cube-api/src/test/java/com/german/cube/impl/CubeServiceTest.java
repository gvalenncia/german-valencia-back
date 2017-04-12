package com.german.cube.impl;

import com.german.cube.model.Block;
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

    @Test
    public void shouldUpdateCubeBlock2x1x2(){
        Block block = new Block(2,2,1, 15);
        cubeService.createCube(5);
        cubeService.updateCubeBlock(block);

        Assert.assertEquals(15, cubeService.computeCubSum());
    }

}
