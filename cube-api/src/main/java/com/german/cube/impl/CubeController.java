package com.german.cube.impl;

import com.german.cube.model.Block;
import com.german.cube.model.Sum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by gvalenncia on 4/11/17.
 */
@RestController
public class CubeController {

    @Autowired
    private CubeService cubeService;

    @PostMapping("/cube/{N}")
    public ResponseEntity createCube (@PathVariable("N") String dimension){
        cubeService.createCube(Integer.parseInt(dimension));
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/cube")
    public ResponseEntity updateCubeBlock(@RequestBody Block block){
        cubeService.updateCubeBlock(block);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/cube")
    public Sum getSumCube(){
        Sum sum = new Sum();
        sum.setSum(cubeService.computeCubSum());
        return sum;
    }

}
