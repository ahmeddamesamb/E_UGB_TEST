package br.com.security.service;

import br.com.security.model.ClubEtudiant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.ClubEtudiant.ClubEtudiantRequest;
import br.com.security.payload.request.etudiant.EtudiantRequest;
import br.com.security.payload.response.ClubEtudiant.ClubEtudiantResponse;
import br.com.security.payload.response.etudiant.EtudiantResponse;

import java.util.List;

public interface ClubEtudiantService {
    List<ClubEtudiant> getAllClubEtudiants();
    ClubEtudiant getClubEtudiantById(long id);
    ClubEtudiantResponse createClubEtudiant(ClubEtudiant clubEtudiant);
    ClubEtudiantResponse updateClubEtudiant(long id, ClubEtudiantRequest clubEtudiantRequest);
    ClubEtudiantResponse deleteClubEtudiant(long id);
}
