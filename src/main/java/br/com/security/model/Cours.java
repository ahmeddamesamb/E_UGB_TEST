package br.com.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private String nomCours;
    @Column
    private String codeCours;
    
    private List<Etudiant> etudiantsInscrits=new ArrayList<>();
 
    @Column
    private String horaireCours;
    @Column
    private String salleClasse;


    @ManyToOne
    @JoinColumn(name = "enseignant_id")
    private Enseignant enseignant;

}
