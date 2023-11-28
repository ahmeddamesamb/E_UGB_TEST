package br.com.security.service;

import br.com.security.model.EmploieDuTemps;
import br.com.security.payload.request.EmploieDuTemps.EmploieDuTempsRequest;
import br.com.security.payload.response.EmploieDuTemps.EmploieDuTempsResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploieDuTempsServiceImpl implements EmploieDuTempsService{
    @Override
    public List<EmploieDuTemps> getAllEmploieDuTemps() {
        return null;
    }

    @Override
    public EmploieDuTemps getEmploieDuTempsById(long id) {
        return null;
    }

    @Override
    public EmploieDuTempsResponse createEmploieDuTemps(EmploieDuTemps emploieDuTemps) {
        return null;
    }

    @Override
    public EmploieDuTempsResponse updateEmploieDuTemps(long id, EmploieDuTempsRequest emploieDuTempsRequest) {
        return null;
    }

    @Override
    public EmploieDuTempsResponse deleteEmploieDuTemps(long id) {
        return null;
    }
}
