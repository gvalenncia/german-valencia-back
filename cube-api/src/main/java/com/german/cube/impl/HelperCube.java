package com.german.cube.impl;

import com.german.cube.model.Block;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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

    public void createCube(int dimension) {
        this.cube = new int[dimension][dimension][dimension];
        Arrays.stream(cube)
                .forEach(dArray -> {
                    Arrays.stream(dArray)
                            .forEach(intArray -> Arrays.fill(intArray, 0));
                });
    }

    public void setBlock(Block block) {
        this.cube[block.getX()][block.getY()][block.getZ()] = block.getW();
    }

    public int sumCube() {
        int[] ints = Arrays.stream(cube)
                .map(dArray -> {
                    int[] sumArray = Arrays.stream(dArray)
                            .map((int[] intArray) -> IntStream.of(intArray).sum())
                            .collect(Collectors.toList())
                            .stream()
                            .mapToInt(Integer::intValue)
                            .toArray();
                    return IntStream.of(sumArray).sum();
                })
                .collect(Collectors.toList())
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        return IntStream.of(ints).sum();
    }
}
