package br.com.security.model;

import br.com.security.utils.ESpecialite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Enseignant extends User{

    @Column
    private String identifiantEnseignant;
    private ESpecialite eSpecialite;

/*    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;*/

/*    @OneToMany(mappedBy = "enseignant")
    private List<Cours> coursEnseignes;*/
}
