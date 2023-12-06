package br.com.security.service;

import java.util.List;

import br.com.security.model.ClubEtudiant;
import br.com.security.payload.request.ClubEtudiant.ClubEtudiantRequest;
import br.com.security.payload.response.ClubEtudiant.ClubEtudiantResponse;

public interface ClubEtudiantService {
    List<ClubEtudiant> getAllClubEtudiants();
    ClubEtudiant getClubEtudiantById(long id);
    ClubEtudiantResponse createClubEtudiant(ClubEtudiant clubEtudiant);
    ClubEtudiantResponse updateClubEtudiant(long id, ClubEtudiantRequest clubEtudiantRequest);
    ClubEtudiantResponse deleteClubEtudiant(long id);
}
