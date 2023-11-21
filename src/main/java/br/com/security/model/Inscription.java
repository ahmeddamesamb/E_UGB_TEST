/*
package br.com.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "etudiant_inscrit_id")
    private Etudiant etudiantInscrit;
    @ManyToOne
    @JoinColumn(name = "cours_inscrit_id")
    private Cours coursInscrit;
    @Column
    private Date dateInscription;


}
*/
