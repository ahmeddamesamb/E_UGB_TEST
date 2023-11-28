package br.com.security.service;

import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.enseignant.EnseignantRequest;
import br.com.security.payload.response.enseignant.EnseignantResponse;

import java.util.List;

public interface EnseignantService {
    List<Enseignant> getAllEnseignants();
    Enseignant getEnseignantById(long id);
    EnseignantResponse createEnseignant(Enseignant enseignant);
    EnseignantResponse updateEnseignant(long id, EnseignantRequest enseignantRequest);
    EnseignantResponse deleteEnseignant(long id);

    
}
