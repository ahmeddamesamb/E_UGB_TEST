package br.com.security.payload.request.enseignant;

import br.com.security.model.ERole;
import br.com.security.payload.request.RegisterRequest;
import br.com.security.utils.ESpecialite;
import br.com.security.utils.EStatus;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class EnseignantRequest {
    private Long id;
    private String nom;
    private String email;
    private String password;
    private String telephone;
    private ERole ERole;
    private EStatus status;
    private String prenom;
    private Date naissance;
    private ESpecialite identifiantEnseignant;
    private ESpecialite specialite;
}
