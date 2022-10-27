package com.study.Stream.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/study")
public class StreamController {

    @GetMapping("/stream")
    public void stream() {

        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");

        Stream<String> stream = list.stream();

        Stream<String> filtered = stream.filter(s -> s.startsWith("c"));
        filtered.forEach(System.out::println);
    }
}
