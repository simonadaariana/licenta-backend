package com.example.demo.repository;

import com.example.demo.entity.AverageCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AverageCategoriesRepository extends JpaRepository<AverageCategories, Integer> {
}
