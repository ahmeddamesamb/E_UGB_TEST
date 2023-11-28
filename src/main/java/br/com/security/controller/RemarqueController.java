package br.com.security.controller;

import br.com.security.model.Remarque;
import br.com.security.payload.request.Remarque.RemarqueRequest;
import br.com.security.payload.response.Remarque.RemarqueResponse;
import br.com.security.service.RemarqueService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class RemarqueController {
    private final RemarqueService remarqueService;

    public RemarqueController(RemarqueService remarqueService) {
        this.remarqueService = remarqueService;
    }

    @GetMapping(Endpoints.URL_REMARQUE)
    public List<Remarque> getAllRemarque() {
        return remarqueService.getAllRemarque();
    }
    @GetMapping(Endpoints.URL_ONE_REMARQUE)
    public Remarque getRemarqueById(@PathVariable Long id) {
        return remarqueService.getRemarqueById(id);
    }
    @PostMapping(Endpoints.URL_REMARQUE)
    public RemarqueResponse createRemarque(@RequestBody Remarque remarque) {
        return remarqueService.createRemarque(remarque);
    }
    @DeleteMapping(Endpoints.URL_ONE_REMARQUE)
    public RemarqueResponse deleteRemarque(@PathVariable(name = "id") Long id) {
        return remarqueService.deleteRemarque(id);
    }
    @PutMapping(Endpoints.URL_ONE_REMARQUE)
    public RemarqueResponse updateRemarque(@PathVariable Long id, @RequestBody RemarqueRequest remarqueRequest) {
        return remarqueService.updateRemarque(id,remarqueRequest);
    }
}
