package br.com.security.service;

import java.util.List;

import br.com.security.model.Finances;
import br.com.security.payload.request.Finances.FinancesRequest;
import br.com.security.payload.response.Finances.FinancesResponse;

public interface FinancesService {
    List<Finances> getAllFinances();
    Finances getFinancesById(long id);
    FinancesResponse createFinances(Finances finances);
    FinancesResponse updateFinances(long id, FinancesRequest financesRequest);
    FinancesResponse deleteFinances(long id);
}
