package br.com.security.service;

import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.enseignant.EnseignantRequest;

import java.util.List;

public interface EnseignantService {
    List<Enseignant> getAllEnseignant();
    Enseignant createEnseignant(EnseignantRequest enseignantRequest);

    Enseignant updateEnseignant(long id, EnseignantRequest enseignantRequest);

    void deleteEnseignant(long id);

    Enseignant getEnseignantById(long id);
}
