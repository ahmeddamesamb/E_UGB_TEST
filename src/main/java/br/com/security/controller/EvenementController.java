package br.com.security.controller;

import br.com.security.model.Evenement;
import br.com.security.payload.request.Evenement.EvenementRequest;
import br.com.security.payload.response.Evenement.EvenementResponse;
import br.com.security.service.EvenementService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class EvenementController {
    private final EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @GetMapping(Endpoints.URL_EVENEMENT)
    public List<Evenement> getAllEvenement() {
        return evenementService.getAllEvenement();
    }
    @GetMapping(Endpoints.URL_ONE_EVENEMENT)
    public Evenement getEvenementById(@PathVariable Long id) {
        return evenementService.getEvenementById(id);
    }
    @PostMapping(Endpoints.URL_EVENEMENT)
    public EvenementResponse createEvenement(@RequestBody Evenement evenement) {
        return evenementService.createEvenement(evenement);
    }
    @DeleteMapping(Endpoints.URL_ONE_EVENEMENT)
    public EvenementResponse deleteEvenement(@PathVariable(name = "id") Long id) {
        return evenementService.deleteEvenement(id);
    }
    @PutMapping(Endpoints.URL_ONE_EVENEMENT)
    public EvenementResponse updateEvenement(@PathVariable Long id, @RequestBody EvenementRequest evenementRequest) {
        return evenementService.updateEvenement(id,evenementRequest);
    }
}
