package br.com.security.service;

import br.com.security.model.ClubEtudiant;
import br.com.security.payload.request.ClubEtudiant.ClubEtudiantRequest;
import br.com.security.payload.response.ClubEtudiant.ClubEtudiantResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubEtudiantServiceImpl implements ClubEtudiantService{
    @Override
    public List<ClubEtudiant> getAllClubEtudiants() {
        return null;
    }

    @Override
    public ClubEtudiant getClubEtudiantById(long id) {
        return null;
    }

    @Override
    public ClubEtudiantResponse createClubEtudiant(ClubEtudiant clubEtudiant) {
        return null;
    }

    @Override
    public ClubEtudiantResponse updateClubEtudiant(long id, ClubEtudiantRequest clubEtudiantRequest) {
        return null;
    }

    @Override
    public ClubEtudiantResponse deleteClubEtudiant(long id) {
        return null;
    }
}
