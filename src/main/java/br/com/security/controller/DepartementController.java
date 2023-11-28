package br.com.security.controller;

import br.com.security.model.Departement;
import br.com.security.payload.request.Departement.DepartementRequest;
import br.com.security.payload.response.Departement.DepartementResponse;
import br.com.security.service.DepartementService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class DepartementController {
    private final DepartementService departementService;

    public DepartementController(DepartementService departementService) {
        this.departementService = departementService;
    }

    @GetMapping(Endpoints.URL_DEPARTEMENT)
    public List<Departement> getAllDepartement() {
        return departementService.getAllDepartements();
    }
    @GetMapping(Endpoints.URL_ONE_DEPARTEMENT)
    public Departement getDepartementById(@PathVariable Long id) {
        return departementService.getDepartementById(id);
    }
    @PostMapping(Endpoints.URL_DEPARTEMENT)
    public DepartementResponse createDepartement(@RequestBody Departement departement) {
        return departementService.createDepartement(departement);
    }
    @DeleteMapping(Endpoints.URL_ONE_DEPARTEMENT)
    public DepartementResponse deleteDepartement(@PathVariable(name = "id") Long id) {
        return departementService.deleteDepartement(id);
    }
    @PutMapping(Endpoints.URL_ONE_DEPARTEMENT)
    public DepartementResponse updateDepartement(@PathVariable Long id, @RequestBody DepartementRequest departementRequest) {
        return departementService.updateDepartement(id,departementRequest);
    }
}
