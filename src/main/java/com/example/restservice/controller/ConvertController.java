package com.example.restservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

    @GetMapping("/convert")
    public ResponseEntity<String>callConvertService() {

        try {
            return new ResponseEntity<>("1", HttpStatus.OK);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }


    }


    //   http://localhost:8081/convert/1
    //   http://localhost:8081/convert/X
}
