package br.com.security.controller;

import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.enseignant.EnseignantRequest;
import br.com.security.payload.response.enseignant.EnseignantResponse;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.service.EnseignantService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(Endpoints.URL_APP)
@CrossOrigin("*")
public class EnseignantController {
private final EnseignantService enseignantService;

    public EnseignantController(EnseignantService enseignantService) {
        this.enseignantService = enseignantService;
    }
    @GetMapping(Endpoints.URL_ENSEIGNANT)
    public List<Enseignant> getAllEtudiants() {
        return enseignantService.getAllEnseignants();
    }
    @GetMapping(Endpoints.URL_ONE_ENSEIGNANT)
    public Enseignant getEnseignantById(@PathVariable Long id) {
        return enseignantService.getEnseignantById(id);
    }
    @PostMapping(Endpoints.URL_ENSEIGNANT)
    public EnseignantResponse createEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantService.createEnseignant(enseignant);
    }
    @DeleteMapping(Endpoints.URL_ONE_ENSEIGNANT)
    public EnseignantResponse deleteEnseignant(@PathVariable(name = "id") Long id) {
        return enseignantService.deleteEnseignant(id);
    }
    @PutMapping(Endpoints.URL_ONE_ENSEIGNANT)
    public EnseignantResponse updateEnseignant(@PathVariable Long id, @RequestBody EnseignantRequest enseignantRequest) {
        return enseignantService.updateEnseignant(id,enseignantRequest);
    }
}

