package br.com.security.service;

import br.com.security.model.Departement;
import br.com.security.payload.request.Departement.DepartementRequest;
import br.com.security.payload.response.Departement.DepartementResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService{
    @Override
    public List<Departement> getAllDepartements() {
        return null;
    }

    @Override
    public Departement getDepartementById(long id) {
        return null;
    }

    @Override
    public DepartementResponse createDepartement(Departement departement) {
        return null;
    }

    @Override
    public DepartementResponse updateDepartement(long id, DepartementRequest departementRequest) {
        return null;
    }

    @Override
    public DepartementResponse deleteDepartement(long id) {
        return null;
    }
}
