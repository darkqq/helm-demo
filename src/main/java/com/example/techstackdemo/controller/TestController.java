package com.example.techstackdemo.controller;

import jdk.jfr.DataAmount;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TestController {


    private record TestResponse(String value) {
    }

    @GetMapping(value = "/validate", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<TestResponse> validate(@RequestParam String value){
        return ResponseEntity.ok(new TestResponse(value));
    }
}
