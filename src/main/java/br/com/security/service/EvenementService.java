package br.com.security.service;

import br.com.security.model.Evenement;
import br.com.security.payload.request.Evenement.EvenementRequest;
import br.com.security.payload.response.Evenement.EvenementResponse;

import java.util.List;

public interface EvenementService {
    List<Evenement> getAllEvenement();
    Evenement getEvenementById(long id);
    EvenementResponse createEvenement(Evenement evenement);
    EvenementResponse updateEvenement(long id, EvenementRequest evenementRequest);
    EvenementResponse deleteEvenement(long id);
}
