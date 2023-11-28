package br.com.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Finances {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private double budgetTotal;
    @Column
    private List<Double> depensesParDepartement;
    @Column
    private List<Double> recettes;
    @OneToMany(mappedBy = "finances",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Universite> universiteList;
}
