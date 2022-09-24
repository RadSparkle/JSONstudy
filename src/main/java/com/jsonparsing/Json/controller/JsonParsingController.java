package com.jsonparsing.Json.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/json")
public class JsonParsingController {

    @GetMapping("/parsing")
    public ResponseEntity<String> parsing(@RequestBody String json){

        return ResponseEntity.ok(json);
    }
}
