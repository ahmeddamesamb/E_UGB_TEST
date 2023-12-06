package br.com.security.service;

import java.util.List;

import br.com.security.model.EmploieDuTemps;
import br.com.security.payload.request.EmploieDuTemps.EmploieDuTempsRequest;
import br.com.security.payload.response.EmploieDuTemps.EmploieDuTempsResponse;

public interface EmploieDuTempsService {
    List<EmploieDuTemps> getAllEmploieDuTemps();
    EmploieDuTemps getEmploieDuTempsById(long id);
    EmploieDuTempsResponse createEmploieDuTemps(EmploieDuTemps emploieDuTemps);
    EmploieDuTempsResponse updateEmploieDuTemps(long id, EmploieDuTempsRequest emploieDuTempsRequest);
    EmploieDuTempsResponse deleteEmploieDuTemps(long id);
}
