package br.com.security.model;

import br.com.security.utils.ESpecialite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Enseignant extends User{

    @Column
    private String identifiantEnseignant;
    @Enumerated(EnumType.STRING) 
    private ESpecialite eSpecialite;

    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;

    @OneToMany(mappedBy = "enseignant")
    private List<Cours> coursEnseignes;
    @ManyToOne
    @JoinColumn(name = "departement_id")
    private Departement departement;
    public Enseignant(Long id, String prenom, String nom, String email, String telephone, Date naissance, br.com.security.model.ERole eRole, ESpecialite eSpecialite, String identifiantEnseignant) {
    }
    
}
