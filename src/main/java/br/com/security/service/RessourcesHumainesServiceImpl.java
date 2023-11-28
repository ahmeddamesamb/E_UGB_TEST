package br.com.security.service;

import br.com.security.model.RessourcesHumaines;
import br.com.security.payload.request.RessourcesHumaines.RessourcesHumainesRequest;
import br.com.security.payload.response.RessourcesHumaines.RessourcesHumainesResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RessourcesHumainesServiceImpl implements RessourcesHumainesService{
    @Override
    public List<RessourcesHumaines> getAllRessourcesHumaines() {
        return null;
    }

    @Override
    public RessourcesHumaines getRessourcesHumainesById(long id) {
        return null;
    }

    @Override
    public RessourcesHumainesResponse createRessourcesHumaines(RessourcesHumaines ressourcesHumaines) {
        return null;
    }

    @Override
    public RessourcesHumainesResponse updateRessourcesHumaines(long id, RessourcesHumainesRequest ressourcesHumainesRequest) {
        return null;
    }

    @Override
    public RessourcesHumainesResponse deleteRessourcesHumaines(long id) {
        return null;
    }
}
