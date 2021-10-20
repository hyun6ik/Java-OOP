package com.practice.javaoop.controller;

import com.practice.javaoop.service.SortService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public ResponseEntity<String> hello(@RequestParam List<String> list) {
        return ResponseEntity.ok(sortService.doSort(list).toString());
    }
}
