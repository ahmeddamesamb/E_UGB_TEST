package br.com.security.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class SystemeMessagerie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column
    private List<String> messagesEtudiants;
    @Column
    private List<String> messagesProfesseurs;
    @Column
    private List<String> messagesAdministration;
    @OneToMany(mappedBy = "systemeMessagerie",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Universite> universiteList;
}