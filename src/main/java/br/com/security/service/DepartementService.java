package br.com.security.service;

import br.com.security.model.Cours;
import br.com.security.model.Departement;
import br.com.security.payload.request.Cours.CoursRequest;
import br.com.security.payload.request.Departement.DepartementRequest;
import br.com.security.payload.response.Cours.CoursResponse;
import br.com.security.payload.response.Departement.DepartementResponse;

import java.util.List;

public interface DepartementService {
    List<Departement> getAllDepartements();
    Departement getDepartementById(long id);
    DepartementResponse createDepartement(Departement departement);
    DepartementResponse updateDepartement(long id, DepartementRequest departementRequest);
    DepartementResponse deleteDepartement(long id);
}
