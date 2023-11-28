package br.com.security.controller;

import br.com.security.model.Inscription;
import br.com.security.payload.request.Inscription.InscriptionRequest;
import br.com.security.payload.response.Inscription.InscriptionResponse;
import br.com.security.service.InscriptionService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class InscriptionController {
    private final InscriptionService inscriptionService;

    public InscriptionController(InscriptionService inscriptionService) {
        this.inscriptionService = inscriptionService;
    }

    @GetMapping(Endpoints.URL_INSCRIPTION)
    public List<Inscription> getAllInscription() {
        return inscriptionService.getAllInscription();
    }
    @GetMapping(Endpoints.URL_ONE_INSCRIPTION)
    public Inscription getInscriptionById(@PathVariable Long id) {
        return inscriptionService.getInscriptionById(id);
    }
    @PostMapping(Endpoints.URL_INSCRIPTION)
    public InscriptionResponse createInscription(@RequestBody Inscription inscription) {
        return inscriptionService.createInscription(inscription);
    }
    @DeleteMapping(Endpoints.URL_ONE_INSCRIPTION)
    public InscriptionResponse deleteInscription(@PathVariable(name = "id") Long id) {
        return inscriptionService.deleteInscription(id);
    }
    @PutMapping(Endpoints.URL_ONE_INSCRIPTION)
    public InscriptionResponse updateInscription(@PathVariable Long id, @RequestBody InscriptionRequest inscriptionRequest) {
        return inscriptionService.updateInscription(id,inscriptionRequest);
    }
}
