package br.com.security.service;

import java.util.List;

import br.com.security.model.Cours;
import br.com.security.payload.request.Cours.CoursRequest;
import br.com.security.payload.response.Cours.CoursResponse;

public interface CoursService {
    List<Cours> getAllCours();
    Cours getCoursById(long id);
    CoursResponse createCours(Cours cours);
    CoursResponse updateCours(long id, CoursRequest coursRequest);
    CoursResponse deleteCours(long id);
}
