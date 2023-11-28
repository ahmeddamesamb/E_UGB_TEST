package br.com.security.service;

import br.com.security.model.ClubEtudiant;
import br.com.security.model.Cours;
import br.com.security.payload.request.ClubEtudiant.ClubEtudiantRequest;
import br.com.security.payload.request.Cours.CoursRequest;
import br.com.security.payload.response.ClubEtudiant.ClubEtudiantResponse;
import br.com.security.payload.response.Cours.CoursResponse;

import java.util.List;

public interface CoursService {
    List<Cours> getAllCours();
    Cours getCoursById(long id);
    CoursResponse createCours(Cours cours);
    CoursResponse updateCours(long id, CoursRequest coursRequest);
    CoursResponse deleteCours(long id);
}
