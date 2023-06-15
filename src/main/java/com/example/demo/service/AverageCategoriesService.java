package com.example.demo.service;

import com.example.demo.entity.AverageCategories;
import com.example.demo.entity.TotalAverageCategories;
import com.example.demo.repository.AverageCategoriesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AverageCategoriesService {
    private final AverageCategoriesRepository averageCategoriesRepository;

    public AverageCategories saveAverageCategory(AverageCategories averageCategories) {
        return averageCategoriesRepository.save(averageCategories);
    }

    public TotalAverageCategories getTotalAverage() {
        TotalAverageCategories totalAverageCategories = new TotalAverageCategories();

        List<AverageCategories> averageCategoriesList = averageCategoriesRepository.findAll();

        totalAverageCategories.setTotalAverageCategoryCultura(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryCultura).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryAbilitati(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryAbilitati).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryEcosistem(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryEcosistem).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryDateleSiAnalizaLor(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryDateleSiAnalizaLor).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryInovatie(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryInovatie).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryOperatiuni(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryOperatiuni).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryOrganizare(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryOrganizare).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryStrategie(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryStrategie).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryTehnologie(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryTehnologie).reduce(0, Integer::sum) / averageCategoriesList.size());

        totalAverageCategories.setTotalAverageCategoryExperientaClientilor(averageCategoriesList.stream().map(AverageCategories::getAverageCategoryExperientaClientilor).reduce(0, Integer::sum) / averageCategoriesList.size());

        return totalAverageCategories;
    }
}
