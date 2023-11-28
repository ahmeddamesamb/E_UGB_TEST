package br.com.security.controller;

import br.com.security.model.EmploieDuTemps;
import br.com.security.payload.request.EmploieDuTemps.EmploieDuTempsRequest;
import br.com.security.payload.response.EmploieDuTemps.EmploieDuTempsResponse;
import br.com.security.service.EmploieDuTempsService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class EmploieDuTempsController {
    private final EmploieDuTempsService emploieDuTempsService;

    public EmploieDuTempsController(EmploieDuTempsService emploieDuTempsService) {
        this.emploieDuTempsService = emploieDuTempsService;
    }

    @GetMapping(Endpoints.URL_EMPLOIE_DU_TEMPS)
    public List<EmploieDuTemps> getAllEmploieDuTemps() {
        return emploieDuTempsService.getAllEmploieDuTemps();
    }
    @GetMapping(Endpoints.URL_ONE_EMPLOIE_DU_TEMPS)
    public EmploieDuTemps getEmploieDuTempsById(@PathVariable Long id) {
        return emploieDuTempsService.getEmploieDuTempsById(id);
    }
    @PostMapping(Endpoints.URL_EMPLOIE_DU_TEMPS)
    public EmploieDuTempsResponse createEmploieDuTemps(@RequestBody EmploieDuTemps emploieDuTemps) {
        return emploieDuTempsService.createEmploieDuTemps(emploieDuTemps);
    }
    @DeleteMapping(Endpoints.URL_ONE_EMPLOIE_DU_TEMPS)
    public EmploieDuTempsResponse deleteEmploieDuTemps(@PathVariable(name = "id") Long id) {
        return emploieDuTempsService.deleteEmploieDuTemps(id);
    }
    @PutMapping(Endpoints.URL_ONE_EMPLOIE_DU_TEMPS)
    public EmploieDuTempsResponse updateEmploieDuTemps(@PathVariable Long id, @RequestBody EmploieDuTempsRequest emploieDuTempsRequest) {
        return emploieDuTempsService.updateEmploieDuTemps(id,emploieDuTempsRequest);
    }
}
