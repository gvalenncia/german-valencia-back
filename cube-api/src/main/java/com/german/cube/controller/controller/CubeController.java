package com.german.cube.controller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by gvalenncia on 4/11/17.
 */
@RestController
public class CubeController {

    @PostMapping("/cube/{N}")
    public ResponseEntity createCube (@PathVariable("N") String dimension){
        return new ResponseEntity(HttpStatus.CREATED);
    }

}
