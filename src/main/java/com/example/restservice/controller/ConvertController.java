package com.example.restservice.controller;

import com.example.restservice.service.ConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertController {

    @Autowired
    private ConvertService conversionService = new ConvertService();

    //Get request to invoke converter service.
    @GetMapping("/convert")
    public ResponseEntity<String> getConvertedResponse(@RequestParam(value="value") String value) {

        try {
            String response = conversionService.callService(value);
            return ResponseEntity.ok().body(response);
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
    }

}
