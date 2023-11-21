package br.com.security.controller;

import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.model.User;
import br.com.security.payload.request.enseignant.EnseignantRequest;
import br.com.security.payload.response.enseignant.EnseignantResponse;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.service.EnseignantService;
import br.com.security.utils.Endpoints;
import lombok.Builder;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(Endpoints.URL_APP)
@CrossOrigin("*")
@Builder
public class EnseignantController {
  /*  private final EnseignantService enseignantService;

    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }
    @PutMapping(Endpoints.URL_USER_ONE_ENSEIGNANT)
    public ResponseEntity<EnseignantResponse> updateEnseignant(@PathVariable Long id, @RequestBody EnseignantRequest enseignantRequest) {
        try {
            Enseignant enseignant = enseignantService.updateEnseignant(id, enseignantRequest);
            // Créez une réponse réussie avec l'objet Etudiant
            EnseignantResponse enseignantResponse = new EnseignantResponse(HttpStatus.CREATED.value(), "L'enseignant mise a jour avec succès", User.builder().build());
            // Retour d'une réponse avec le statut CREATED
            return new ResponseEntity<>(enseignantResponse, HttpStatus.CREATED);        } catch (Exception e) {
            // En cas d'erreur, renvoyer une réponse d'erreur au client
            EnseignantResponse errorResponse = new EnseignantResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Erreur lors de la mise a jour de l'enseignant : " + e.getMessage(),User.builder().build());
            // Retour d'une réponse avec le statut INTERNAL_SERVER_ERROR
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);        }
    }

    @DeleteMapping(Endpoints.URL_USER_ONE_ENSEIGNANT)
    public ResponseEntity<EnseignantResponse> deleteEnseignant(@PathVariable(name = "id") Long id) {
        try {
            enseignantService.deleteEnseignant(id);

            EnseignantResponse enseignantResponse = new EnseignantResponse(HttpStatus.CREATED.value(), "Enseignant suprrimer avec succès", User.builder().build());
            // Retour d'une réponse avec le statut CREATED
            return new ResponseEntity<>(enseignantResponse, HttpStatus.CREATED);
        } catch (Exception e) {
            // En cas d'erreur, renvoyer une réponse d'erreur au client
            EnseignantResponse errorResponse = new EnseignantResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "Erreur lors de la supression de l'enseignant : " + e.getMessage(),User.builder().build());
            // Retour d'une réponse avec le statut INTERNAL_SERVER_ERROR
            return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
*/


}

