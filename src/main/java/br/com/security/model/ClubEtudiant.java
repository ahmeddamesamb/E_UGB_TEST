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
public class ClubEtudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String nomClub;
    @Column
    private List<String> membres;
    @Column
    private List<String> evenementsOrganises;
    @Column
    private double budgetClub;
    @ManyToOne
    @JoinColumn(name = "universite_id")
    private Universite universite;
}
