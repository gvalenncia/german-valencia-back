package com.german.cube.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by gvalenncia on 4/11/17.
 */
@Component
@Scope("singleton")
public class HelperCube {

    private int[][][] cube;


    public int getCubeSize() {
        return cube.length;
    }

    public void setCube(int dimension) {
        this.cube = new int[dimension][dimension][dimension];
    }
}
