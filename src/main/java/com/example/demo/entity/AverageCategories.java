package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "average_categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class AverageCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer averageCategoryOrganizare;
    private Integer averageCategoryTehnologie;
    private Integer averageCategoryAbilitati;
    private Integer averageCategoryEcosistem;
    private Integer averageCategoryStrategie;
    private Integer averageCategoryOperatiuni;
    private Integer averageCategoryCultura;
    private Integer averageCategoryInovatie;
    private Integer averageCategoryDateleSiAnalizaLor;
    private Integer averageCategoryExperientaClientilor;
}
