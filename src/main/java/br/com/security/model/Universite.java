/*
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
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nomUniversite;
    private List<Departement> departements;
    private List<Enseignant> enseignantList;
    @Column
    private String coordonneesAdministration;
    private List<ClubEtudiant> clubsEtudiants;
    private List<Evenement> evenements;
    private Finances finances;
    private RessourcesHumaines ressourcesHumaines;
    private SystemeMessagerie systemeMessagerie;
    @OneToMany(mappedBy = "universite")
    private List<Etudiant> etudiants;
    @OneToMany(mappedBy = "universite")
    private List<Enseignant> enseignants;
}
*/
