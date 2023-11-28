package br.com.security.controller;

import br.com.security.model.Cours;
import br.com.security.payload.request.Cours.CoursRequest;
import br.com.security.payload.response.Cours.CoursResponse;
import br.com.security.service.CoursService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class CoursController {
    private final CoursService coursService;

    public CoursController(CoursService coursService) {
        this.coursService = coursService;
    }

    @GetMapping(Endpoints.URL_COURS)
    public List<Cours> getAllCours() {
        return coursService.getAllCours();
    }
    @GetMapping(Endpoints.URL_ONE_COURS)
    public Cours getCoursById(@PathVariable Long id) {
        return coursService.getCoursById(id);
    }
    @PostMapping(Endpoints.URL_COURS)
    public CoursResponse createCours(@RequestBody Cours cours) {
        return coursService.createCours(cours);
    }
    @DeleteMapping(Endpoints.URL_ONE_COURS)
    public CoursResponse deleteCours(@PathVariable(name = "id") Long id) {
        return coursService.deleteCours(id);
    }
    @PutMapping(Endpoints.URL_ONE_COURS)
    public CoursResponse updateCours(@PathVariable Long id, @RequestBody CoursRequest coursRequest) {
        return coursService.updateCours(id,coursRequest);
    }
}
