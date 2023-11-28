package br.com.security.service;

import java.util.List;

import br.com.security.model.RessourcesHumaines;
import br.com.security.payload.request.RessourcesHumaines.RessourcesHumainesRequest;
import br.com.security.payload.response.RessourcesHumaines.RessourcesHumainesResponse;

public interface RessourcesHumainesService {
    List<RessourcesHumaines> getAllRessourcesHumaines();
    RessourcesHumaines getRessourcesHumainesById(long id);
    RessourcesHumainesResponse createRessourcesHumaines(RessourcesHumaines ressourcesHumaines);
    RessourcesHumainesResponse updateRessourcesHumaines(long id, RessourcesHumainesRequest ressourcesHumainesRequest);
    RessourcesHumainesResponse deleteRessourcesHumaines(long id);
}
