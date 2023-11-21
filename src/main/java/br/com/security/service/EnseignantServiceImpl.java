package br.com.security.service;

import br.com.security.model.ERole;
import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.enseignant.EnseignantRequest;
import br.com.security.repository.EnseignantRepository;
import br.com.security.utils.ESpecialite;
import br.com.security.utils.UtilsImpl;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EnseignantServiceImpl implements EnseignantService{
    private final EnseignantRepository enseignantRepository;
    private final PasswordEncoder passwordEncoder;
    private final UtilsImpl utils;

    public EnseignantServiceImpl(EnseignantRepository enseignantRepository, PasswordEncoder passwordEncoder, UtilsImpl utils) {
        this.enseignantRepository = enseignantRepository;
        this.passwordEncoder = passwordEncoder;
        this.utils = utils;
    }

    @Override
    public List<Enseignant> getAllEnseignant() {
        return enseignantRepository.findAll();
    }
    
    @Override
    public Enseignant createEnseignant(EnseignantRequest enseignantRequest) {
        Enseignant nouvelEnseignant = new Enseignant();
        nouvelEnseignant.setEmail(enseignantRequest.getEmail());
        nouvelEnseignant.setNom(enseignantRequest.getNom());
        nouvelEnseignant.setPrenom(enseignantRequest.getPrenom());
        nouvelEnseignant.setERole(ERole.ENSEIGNAT);
        nouvelEnseignant.setNaissance(enseignantRequest.getNaissance());
        nouvelEnseignant.setTelephone(enseignantRequest.getTelephone());
        nouvelEnseignant.setPassword(passwordEncoder.encode(enseignantRequest.getPassword()));
        nouvelEnseignant.setIdentifiantEnseignant("E"+utils.generateCodePin());
        nouvelEnseignant.setESpecialite(ESpecialite.CYBERSECURITY);
        return enseignantRepository.save(nouvelEnseignant); 
    }

    @Override
    public Enseignant updateEnseignant(long id, EnseignantRequest enseignantRequest) {
        Enseignant enseignant = enseignantRepository
            .findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "La tentative de mise a jour du user na pas aboutit"
                )
            );
        enseignant.setNom(enseignantRequest.getNom());
        enseignant.setPrenom(enseignantRequest.getPrenom());
        enseignant.setNaissance(enseignantRequest.getNaissance());
        enseignant.setEmail(enseignantRequest.getEmail());
        enseignant.setPassword(passwordEncoder.encode(enseignantRequest.getPassword()));
        enseignant.setTelephone(enseignantRequest.getTelephone());
        enseignant.setERole(ERole.ENSEIGNAT);
        enseignant.setIdentifiantEnseignant("E"+utils.generateCodePin());
        enseignant .setESpecialite(ESpecialite.CYBERSECURITY);
        return enseignantRepository.save(enseignant);
    }

    @Override
    public void deleteEnseignant(long id) {
        Enseignant enseignant = enseignantRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("l'user que vous tenter de supprimer n existe pas"));
        enseignantRepository.delete(enseignant);
    }

    @Override
    public Enseignant getEnseignantById(long id) {

        Optional<Enseignant> result = enseignantRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new ResourceNotFoundException("l'etudiant que vous checher n existe pas!!!");
        }
    }
}

