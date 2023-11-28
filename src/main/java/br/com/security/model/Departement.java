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
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nomDepartement;
    @OneToMany(mappedBy = "departement")
    private List<Cours> coursEnseignes;
    @OneToMany(mappedBy = "departement")
    private List<Enseignant> enseignantDepartement;
    
    @Column
    private String coordonneesChefDepartement;
    
    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

}
