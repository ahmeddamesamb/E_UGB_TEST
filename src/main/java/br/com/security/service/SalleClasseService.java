package br.com.security.service;

import java.util.List;

import br.com.security.model.SalleClasse;
import br.com.security.payload.request.SalleClasse.SalleClasseRequest;
import br.com.security.payload.response.SalleClasse.SalleClasseResponse;

public interface SalleClasseService {
    List<SalleClasse> getAllSalleClasse();
    SalleClasse getSalleClasseById(long id);
    SalleClasseResponse createSalleClasse(SalleClasse salleClasse);
    SalleClasseResponse updateSalleClasse(long id, SalleClasseRequest salleClasseRequest);
    SalleClasseResponse deleteSalleClasse(long id);
}
