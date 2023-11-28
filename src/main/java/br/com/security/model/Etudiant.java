package br.com.security.model;

import br.com.security.utils.EStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant extends User{
 
 
    @Column
    private String identifiantEtudiant;
    @Column
    private String programmeEtudes;
    @Column
    private String remarques;
    @ElementCollection
    private List<String> historiqueCoursSuivis;
    @ElementCollection
    private List<String> listeCoursInscrits;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
    @OneToMany(mappedBy = "etudiant")
    private List<Inscription> inscriptionList;

    public Etudiant(Long id, String identifiantEtudiant, String prenom, String nom, String email, String telephone, String statut, Date naissance, br.com.security.model.ERole eRole) {
    }

    public Etudiant(Long id, String identifiantEtudiant, String prenom, String nom, String email, String telephone, EStatus status, Date naissance, br.com.security.model.ERole eRole) {
    }
}


