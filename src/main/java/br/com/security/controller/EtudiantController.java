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
    public Etudiant getUserById(@PathVariable Long id) {
        return etudiantService.getEtudiantById(id);
    } 
    @PostMapping(Endpoints.URL_ETUDIANT)
    public EtudiantResponse createUser(@RequestBody Etudiant etudiant) {
        return etudiantService.createEtudiant(etudiant);
    }
    @DeleteMapping(Endpoints.URL_USER_ONE_ETUDIANT)
    public ResponseEntity<Etudiant> deleteUser(@PathVariable(name = "id") Long id) {
        etudiantService.deleteEtudiant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping(Endpoints.URL_USER_ONE_ETUDIANT)
    public EtudiantResponse updateUser(@PathVariable Long id, @RequestBody Etudiant etudiant) {
        return etudiantService.updateEtudiant(id,etudiant);
    }

}
