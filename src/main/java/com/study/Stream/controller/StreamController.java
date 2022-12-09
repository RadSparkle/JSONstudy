package com.study.Stream.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RestController
@RequestMapping("/study/stream")
public class StreamController {

    @GetMapping("/filter")
    public void streamFilter() {

        List<String> list = Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");

        Stream<String> stream = list.stream();

        Stream<String> filtered = stream.filter(s -> s.startsWith("c"));
        filtered.forEach(System.out::println);
    }

    @GetMapping("/map")
    public void streamMap() {
        List<String> list =
                Arrays.asList("a1", "a2", "b1", "b2", "c2", "c1", "c3");
        Stream<String> stream = list.stream();
        stream.map(s -> s.toUpperCase()).forEach(System.out::println);
    }

    @GetMapping("/range")
    public IntStream streamRange() {
        IntStream stream = IntStream.range(4,10);

        return stream;
    }

}
