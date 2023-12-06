package br.com.security.service;

import java.util.List;

import br.com.security.model.Departement;
import br.com.security.payload.request.Departement.DepartementRequest;
import br.com.security.payload.response.Departement.DepartementResponse;

public interface DepartementService {
    List<Departement> getAllDepartements();
    Departement getDepartementById(long id);
    DepartementResponse createDepartement(Departement departement);
    DepartementResponse updateDepartement(long id, DepartementRequest departementRequest);
    DepartementResponse deleteDepartement(long id);
}
