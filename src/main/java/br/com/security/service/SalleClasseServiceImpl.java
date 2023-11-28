package br.com.security.service;

import br.com.security.model.SalleClasse;
import br.com.security.payload.request.SalleClasse.SalleClasseRequest;
import br.com.security.payload.response.SalleClasse.SalleClasseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalleClasseServiceImpl implements SalleClasseService{
    @Override
    public List<SalleClasse> getAllSalleClasse() {
        return null;
    }

    @Override
    public SalleClasse getSalleClasseById(long id) {
        return null;
    }

    @Override
    public SalleClasseResponse createSalleClasse(SalleClasse salleClasse) {
        return null;
    }

    @Override
    public SalleClasseResponse updateSalleClasse(long id, SalleClasseRequest salleClasseRequest) {
        return null;
    }

    @Override
    public SalleClasseResponse deleteSalleClasse(long id) {
        return null;
    }
}
