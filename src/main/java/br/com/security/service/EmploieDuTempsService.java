package br.com.security.service;

import br.com.security.model.Departement;
import br.com.security.model.EmploieDuTemps;
import br.com.security.payload.request.Departement.DepartementRequest;
import br.com.security.payload.request.EmploieDuTemps.EmploieDuTempsRequest;
import br.com.security.payload.response.Departement.DepartementResponse;
import br.com.security.payload.response.EmploieDuTemps.EmploieDuTempsResponse;

import java.util.List;

public interface EmploieDuTempsService {
    List<EmploieDuTemps> getAllEmploieDuTemps();
    EmploieDuTemps getEmploieDuTempsById(long id);
    EmploieDuTempsResponse createEmploieDuTemps(EmploieDuTemps emploieDuTemps);
    EmploieDuTempsResponse updateEmploieDuTemps(long id, EmploieDuTempsRequest emploieDuTempsRequest);
    EmploieDuTempsResponse deleteEmploieDuTemps(long id);
}
