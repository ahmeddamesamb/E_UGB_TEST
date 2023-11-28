package br.com.security.service;

import java.util.List;

import br.com.security.model.Remarque;
import br.com.security.payload.request.Remarque.RemarqueRequest;
import br.com.security.payload.response.Remarque.RemarqueResponse;

public interface RemarqueService {
    List<Remarque> getAllRemarque();
    Remarque getRemarqueById(long id);
    RemarqueResponse createRemarque(Remarque remarque);
    RemarqueResponse updateRemarque(long id, RemarqueRequest remarqueRequest);
    RemarqueResponse deleteRemarque(long id);
}
