package br.com.security.payload.request.etudiant;

import java.util.Date;
import java.util.List;

import br.com.security.model.ERole;
import br.com.security.utils.EStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EtudiantRequest  {
    private Long id;
    private String nom;
    private String email;
    private String password;
    private String telephone;
    private ERole ERole;
    private String prenom;
    private Date naissance;
    private String identifiantEtudiant;
    private String programmeEtudes;
    private EStatus statut;
    private String remarques;
    private List<String> historiqueCoursSuivis;
    private List<String> listeCoursInscrits;
}
