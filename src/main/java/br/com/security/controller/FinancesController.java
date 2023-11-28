package br.com.security.controller;

import br.com.security.model.Finances;
import br.com.security.payload.request.Finances.FinancesRequest;
import br.com.security.payload.response.Finances.FinancesResponse;
import br.com.security.service.FinancesService;
import br.com.security.utils.Endpoints;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Endpoints.URL)
@CrossOrigin("*")
public class FinancesController {
    private final FinancesService financesService;

    public FinancesController(FinancesService financesService) {
        this.financesService = financesService;
    }

    @GetMapping(Endpoints.URL_FINANCES)
    public List<Finances> getAllFinances() {
        return financesService.getAllFinances();
    }
    @GetMapping(Endpoints.URL_ONE_FINANCES)
    public Finances getFinancesById(@PathVariable Long id) {
        return financesService.getFinancesById(id);
    }
    @PostMapping(Endpoints.URL_FINANCES)
    public FinancesResponse createFinances(@RequestBody Finances finances) {
        return financesService.createFinances(finances);
    }
    @DeleteMapping(Endpoints.URL_ONE_FINANCES)
    public FinancesResponse deleteFinances(@PathVariable(name = "id") Long id) {
        return financesService.deleteFinances(id);
    }
    @PutMapping(Endpoints.URL_ONE_FINANCES)
    public FinancesResponse updateFinances(@PathVariable Long id, @RequestBody FinancesRequest financesRequest) {
        return financesService.updateFinances(id,financesRequest);
    }
}
