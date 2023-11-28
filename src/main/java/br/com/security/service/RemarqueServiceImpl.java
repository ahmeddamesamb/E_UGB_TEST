package br.com.security.service;

import br.com.security.model.Remarque;
import br.com.security.payload.request.Remarque.RemarqueRequest;
import br.com.security.payload.response.Remarque.RemarqueResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemarqueServiceImpl implements RemarqueService{
    @Override
    public List<Remarque> getAllRemarque() {
        return null;
    }

    @Override
    public Remarque getRemarqueById(long id) {
        return null;
    }

    @Override
    public RemarqueResponse createRemarque(Remarque remarque) {
        return null;
    }

    @Override
    public RemarqueResponse updateRemarque(long id, RemarqueRequest remarqueRequest) {
        return null;
    }

    @Override
    public RemarqueResponse deleteRemarque(long id) {
        return null;
    }
}
