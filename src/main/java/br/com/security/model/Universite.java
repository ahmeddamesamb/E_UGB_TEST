package br.com.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
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
    @Column
    private String coordonneesAdministration;
    @ManyToOne
    @JoinColumn(name = "finances_id")
    private Finances finances;
    @ManyToOne
    @JoinColumn(name = "ressourcesHumaines_id")
    private RessourcesHumaines ressourcesHumaines;
    @ManyToOne
    @JoinColumn(name = "systemeMessagerie_id")
    private SystemeMessagerie systemeMessagerie;
 
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Etudiant> etudiants;
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Enseignant> enseignants;
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Evenement> evenements;
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ClubEtudiant> clubsEtudiants;
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Enseignant> enseignantList;
    @OneToMany(mappedBy = "universite",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Departement> departements;
}
