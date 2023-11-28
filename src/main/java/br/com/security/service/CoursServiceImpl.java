package br.com.security.service;

import br.com.security.model.Cours;
import br.com.security.payload.request.Cours.CoursRequest;
import br.com.security.payload.response.Cours.CoursResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService{
    @Override
    public List<Cours> getAllCours() {
        return null;
    }

    @Override
    public Cours getCoursById(long id) {
        return null;
    }

    @Override
    public CoursResponse createCours(Cours cours) {
        return null;
    }

    @Override
    public CoursResponse updateCours(long id, CoursRequest coursRequest) {
        return null;
    }

    @Override
    public CoursResponse deleteCours(long id) {
        return null;
    }
}
