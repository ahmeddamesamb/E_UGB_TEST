package br.com.security.service;

import br.com.security.model.Inscription;
import br.com.security.payload.request.Inscription.InscriptionRequest;
import br.com.security.payload.response.Inscription.InscriptionResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionServiceImpl implements InscriptionService{
    @Override
    public List<Inscription> getAllInscription() {
        return null;
    }

    @Override
    public Inscription getInscriptionById(long id) {
        return null;
    }

    @Override
    public InscriptionResponse createInscription(Inscription inscription) {
        return null;
    }

    @Override
    public InscriptionResponse updateInscription(long id, InscriptionRequest inscriptionRequest) {
        return null;
    }

    @Override
    public InscriptionResponse deleteInscription(long id) {
        return null;
    }
}
