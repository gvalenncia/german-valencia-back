package com.german.cube.impl;

import com.german.cube.model.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gvalenncia on 4/11/17.
 */
@Service
public class CubeService {

    @Autowired
    private HelperCube helperCube;

    public void createCube(int dimension){
        helperCube.createCube(dimension);
    }

    public int getCubeSize() {
        return helperCube.getCubeSize();
    }

    public void updateCubeBlock(Block block) {
        helperCube.setBlock(block);
    }

    public int computeCubSum() {
        return helperCube.sumCube();
    }
}
