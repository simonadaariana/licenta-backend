package com.example.demo.controller;

import com.example.demo.entity.AverageCategories;
import com.example.demo.entity.TotalAverageCategories;
import com.example.demo.service.AverageCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "average-company")
@CrossOrigin(origins = "*")
public class AverageCategoriesController {
    private final AverageCategoriesService averageCategoriesService;

    @PostMapping
    public ResponseEntity<AverageCategories> saveAverageCategories(@RequestBody AverageCategories averageCategories) {
        return new ResponseEntity<>(averageCategoriesService.saveAverageCategory(averageCategories), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<TotalAverageCategories> saveAverageCategories() {
        return new ResponseEntity<>(averageCategoriesService.getTotalAverage(), HttpStatus.CREATED);
    }
}
