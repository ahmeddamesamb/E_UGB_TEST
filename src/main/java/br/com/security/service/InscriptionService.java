package br.com.security.service;

import java.util.List;

import br.com.security.model.Inscription;
import br.com.security.payload.request.Inscription.InscriptionRequest;
import br.com.security.payload.response.Inscription.InscriptionResponse;

public interface InscriptionService {
    List<Inscription> getAllInscription();
    Inscription getInscriptionById(long id);
    InscriptionResponse createInscription(Inscription inscription);
    InscriptionResponse updateInscription(long id, InscriptionRequest inscriptionRequest);
    InscriptionResponse deleteInscription(long id);
}
