package com.paul.SampleAPI.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class SampleController {

    @GetMapping
    public ResponseEntity<?> sampleEndPoint(){
        return ResponseEntity.ok("Hello Spring Boot...");
    }
}
