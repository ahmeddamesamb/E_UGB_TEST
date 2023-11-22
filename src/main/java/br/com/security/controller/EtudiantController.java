package br.com.security.controller;

import br.com.security.model.Etudiant;
import br.com.security.model.User;
import br.com.security.payload.request.etudiant.EtudiantRequest;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.service.EtudiantService;
import br.com.security.utils.Endpoints;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(Endpoints.URL_APP)
@CrossOrigin("*")
public class EtudiantController {
    private final EtudiantService etudiantService;

    public EtudiantController(EtudiantService etudiantService) {
        this.etudiantService = etudiantService;
    }

    @GetMapping(Endpoints.URL_ETUDIANT)
    public List<Etudiant> getAllEtudiants() {
        return etudiantService.getAllEtudiants();
    }
    @GetMapping(Endpoints.URL_USER_ONE_ETUDIANT)
    public Etudiant getEtudiantById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    } 
    @PostMapping(Endpoints.URL_ETUDIANT)
    public EtudiantResponse createEtudiant(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @DeleteMapping(Endpoints.URL_USER_ONE_ETUDIANT)
    public EtudiantResponse deleteEtudiant(@PathVariable(name = "id") Long id) {
        return etudiantService.deleteEtudiant(id);
    }
    @PutMapping(Endpoints.URL_USER_ONE_ETUDIANT)
    public EtudiantResponse updateEtudiant(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(id,etudiant);
    }

}
