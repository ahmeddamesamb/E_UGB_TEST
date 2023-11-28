package br.com.security.controller;

import br.com.security.model.RessourcesHumaines;
import br.com.security.payload.request.RessourcesHumaines.RessourcesHumainesRequest;
import br.com.security.payload.response.RessourcesHumaines.RessourcesHumainesResponse;
import br.com.security.service.RessourcesHumainesService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class RessourcesHumainesController {
    private final RessourcesHumainesService ressourcesHumainesService;

    public RessourcesHumainesController(RessourcesHumainesService ressourcesHumainesService) {
        this.ressourcesHumainesService = ressourcesHumainesService;
    }

    @GetMapping(Endpoints.URL_RESSOURCES_HUMAINES)
    public List<RessourcesHumaines> getAllRessourcesHumaines() {
        return ressourcesHumainesService.getAllRessourcesHumaines();
    }
    @GetMapping(Endpoints.URL_ONE_RESSOURCES_HUMAINES)
    public RessourcesHumaines getRessourcesHumainesById(@PathVariable Long id) {
        return ressourcesHumainesService.getRessourcesHumainesById(id);
    }
    @PostMapping(Endpoints.URL_RESSOURCES_HUMAINES)
    public RessourcesHumainesResponse createRessourcesHumaines(@RequestBody RessourcesHumaines ressourcesHumaines) {
        return ressourcesHumainesService.createRessourcesHumaines(ressourcesHumaines);
    }
    @DeleteMapping(Endpoints.URL_ONE_RESSOURCES_HUMAINES)
    public RessourcesHumainesResponse deleteRessourcesHumaines(@PathVariable(name = "id") Long id) {
        return ressourcesHumainesService.deleteRessourcesHumaines(id);
    }
    @PutMapping(Endpoints.URL_ONE_RESSOURCES_HUMAINES)
    public RessourcesHumainesResponse updateRessourcesHumaines(@PathVariable Long id, @RequestBody RessourcesHumainesRequest ressourcesHumainesRequest) {
        return ressourcesHumainesService.updateRessourcesHumaines(id,ressourcesHumainesRequest);
    }
}
