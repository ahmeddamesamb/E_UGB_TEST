package br.com.security.service;

import br.com.security.model.Finances;
import br.com.security.payload.request.Finances.FinancesRequest;
import br.com.security.payload.response.Finances.FinancesResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancesServiceImpl implements FinancesService{
    @Override
    public List<Finances> getAllFinances() {
        return null;
    }

    @Override
    public Finances getFinancesById(long id) {
        return null;
    }

    @Override
    public FinancesResponse createFinances(Finances finances) {
        return null;
    }

    @Override
    public FinancesResponse updateFinances(long id, FinancesRequest financesRequest) {
        return null;
    }

    @Override
    public FinancesResponse deleteFinances(long id) {
        return null;
    }
}
