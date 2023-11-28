package br.com.security.controller;

import br.com.security.model.ClubEtudiant;
import br.com.security.payload.request.ClubEtudiant.ClubEtudiantRequest;
import br.com.security.payload.response.ClubEtudiant.ClubEtudiantResponse;
import br.com.security.service.ClubEtudiantService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class ClubEtudiantController {
    private final ClubEtudiantService clubEtudiantService;

    public ClubEtudiantController(ClubEtudiantService clubEtudiantService) {
        this.clubEtudiantService = clubEtudiantService;
    }

    @GetMapping(Endpoints.URL_CLUB_ETUDIANT)
    public List<ClubEtudiant> getAllClubEtudiants() {
        return clubEtudiantService.getAllClubEtudiants();
    }
    @GetMapping(Endpoints.URL_ONE_CLUB_ETUDIANT)
    public ClubEtudiant getClubEtudiantById(@PathVariable Long id) {
        return clubEtudiantService.getClubEtudiantById(id);
    }
    @PostMapping(Endpoints.URL_CLUB_ETUDIANT)
    public ClubEtudiantResponse createClubEtudiant(@RequestBody ClubEtudiant clubEtudiant) {
        return clubEtudiantService.createClubEtudiant(clubEtudiant);
    }
    @DeleteMapping(Endpoints.URL_ONE_CLUB_ETUDIANT)
    public ClubEtudiantResponse deleteClubEtudiant(@PathVariable(name = "id") Long id) {
        return clubEtudiantService.deleteClubEtudiant(id);
    }
    @PutMapping(Endpoints.URL_ONE_CLUB_ETUDIANT)
    public ClubEtudiantResponse updateClubEtudiant(@PathVariable Long id, @RequestBody ClubEtudiantRequest clubEtudiantRequest) {
        return clubEtudiantService.updateClubEtudiant(id,clubEtudiantRequest);
    }
}
