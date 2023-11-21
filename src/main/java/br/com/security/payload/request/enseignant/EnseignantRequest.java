package br.com.security.payload.request.enseignant;

import br.com.security.payload.request.RegisterRequest;
import br.com.security.utils.ESpecialite;
import jakarta.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EnseignantRequest extends RegisterRequest {

    private ESpecialite identifiantEnseignant;
    private String specialite;
}
