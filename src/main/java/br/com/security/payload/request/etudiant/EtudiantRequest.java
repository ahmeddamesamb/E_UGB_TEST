package br.com.security.payload.request.etudiant;

import br.com.security.payload.request.RegisterRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EtudiantRequest extends RegisterRequest {
    
    private String identifiantEtudiant;
//    private String programmeEtudes;
    private String statut;
 /*   private String remarques;
    private List<String> historiqueCoursSuivis;
    private List<String> listeCoursInscrits;*/
}
