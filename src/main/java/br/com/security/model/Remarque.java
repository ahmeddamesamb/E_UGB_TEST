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
public class Remarque {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column
    private Etudiant etudiant;
    @ManyToOne
    @JoinColumn(name = "cours_id")
    private Cours cours;
    @Column
    private double notesObtenues;
    @Column
    @Temporal(TemporalType.DATE)
    private Date dateEvaluation;

}
