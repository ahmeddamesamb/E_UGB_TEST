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
public class RessourcesHumaines {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private List<String> listeEmployes;
    @Column
    private List<String> rolesResponsabilites;
    @Column
    private List<String> historiqueSalaires;
    @OneToMany(mappedBy = "ressourcesHumaines",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Universite> universiteList;
}
