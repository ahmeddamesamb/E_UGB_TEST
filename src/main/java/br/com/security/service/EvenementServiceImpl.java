package br.com.security.service;

import br.com.security.model.Evenement;
import br.com.security.payload.request.Evenement.EvenementRequest;
import br.com.security.payload.response.Evenement.EvenementResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementServiceImpl implements EvenementService{
    @Override
    public List<Evenement> getAllEvenement() {
        return null;
    }

    @Override
    public Evenement getEvenementById(long id) {
        return null;
    }

    @Override
    public EvenementResponse createEvenement(Evenement evenement) {
        return null;
    }

    @Override
    public EvenementResponse updateEvenement(long id, EvenementRequest evenementRequest) {
        return null;
    }

    @Override
    public EvenementResponse deleteEvenement(long id) {
        return null;
    }
}
