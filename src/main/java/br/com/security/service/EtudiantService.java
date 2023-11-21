package br.com.security.service;

import br.com.security.model.Etudiant;
import br.com.security.payload.request.etudiant.EtudiantRequest;
import br.com.security.payload.response.etudiant.EtudiantResponse;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> getAllEtudiants();
    Etudiant getEtudiantById(long id);
    EtudiantResponse createEtudiant(Etudiant etudiant);
    EtudiantResponse updateEtudiant(long id, Etudiant etudiant);
    EtudiantResponse deleteEtudiant(long id);

}
