package com.jsonparsing.Json.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonParsingController {

    @GetMapping("/parsing")
    public ResponseEntity parsing(@RequestBody HashMap<String, Object> json){

    HashMap result = (HashMap) json.get("raw");
    ArrayList result2 = (ArrayList) result.get("blocks");

    StringBuilder text = new StringBuilder();

    for (int i =0; i<result2.size();i++){
        HashMap result3 = (HashMap) result2.get(i);
        String result4 = (String) result3.get("text");
        text.append(result4);
    }
    return ResponseEntity.ok(text);
    }
}
