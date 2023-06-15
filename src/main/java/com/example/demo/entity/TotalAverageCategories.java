package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class TotalAverageCategories {
    private Integer totalAverageCategoryOrganizare;
    private Integer totalAverageCategoryTehnologie;
    private Integer totalAverageCategoryAbilitati;
    private Integer totalAverageCategoryEcosistem;
    private Integer totalAverageCategoryStrategie;
    private Integer totalAverageCategoryOperatiuni;
    private Integer totalAverageCategoryCultura;
    private Integer totalAverageCategoryInovatie;
    private Integer totalAverageCategoryDateleSiAnalizaLor;
    private Integer totalAverageCategoryExperientaClientilor;
}
