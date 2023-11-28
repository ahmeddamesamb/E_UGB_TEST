package br.com.security.controller;

import br.com.security.model.SalleClasse;
import br.com.security.payload.request.SalleClasse.SalleClasseRequest;
import br.com.security.payload.response.SalleClasse.SalleClasseResponse;
import br.com.security.service.SalleClasseService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class SalleClasseController {
    private final SalleClasseService salleClasseService;

    public SalleClasseController(SalleClasseService salleClasseService) {
        this.salleClasseService = salleClasseService;
    }

    @GetMapping(Endpoints.URL_SALLE_DE_CLASSE)
    public List<SalleClasse> getAllSalleClasse() {
        return salleClasseService.getAllSalleClasse();
    }
    @GetMapping(Endpoints.URL_ONE_SALLE_DE_CLASSE)
    public SalleClasse getSalleClasseById(@PathVariable Long id) {
        return salleClasseService.getSalleClasseById(id);
    }
    @PostMapping(Endpoints.URL_SALLE_DE_CLASSE)
    public SalleClasseResponse createSalleClasse(@RequestBody SalleClasse salleClasse) {
        return salleClasseService.createSalleClasse(salleClasse);
    }
    @DeleteMapping(Endpoints.URL_ONE_SALLE_DE_CLASSE)
    public SalleClasseResponse deleteSalleClasse(@PathVariable(name = "id") Long id) {
        return salleClasseService.deleteSalleClasse(id);
    }
    @PutMapping(Endpoints.URL_ONE_SALLE_DE_CLASSE)
    public SalleClasseResponse updateSalleClasse(@PathVariable Long id, @RequestBody SalleClasseRequest salleClasseRequest) {
        return salleClasseService.updateSalleClasse(id,salleClasseRequest);
    }
}
