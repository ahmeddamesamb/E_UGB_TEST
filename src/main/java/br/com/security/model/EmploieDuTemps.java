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
public class EmploieDuTemps {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private String semaineAcademique;
    @Column
    private List<String> coursParJourEtHeure;
    
    @OneToMany(mappedBy = "emploieDuTemps",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<SalleClasse> sallesAttribuees;

}
