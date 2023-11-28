package br.com.security.service;

import br.com.security.model.ERole;
import br.com.security.model.Enseignant;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.enseignant.EnseignantRequest;
import br.com.security.payload.response.enseignant.EnseignantResponse;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.repository.EnseignantRepository;
import br.com.security.utils.ESpecialite;
import br.com.security.utils.EStatus;
import br.com.security.utils.Status;
import br.com.security.utils.UtilsImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Log4j2
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
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }

    @Override
    public Enseignant getEnseignantById(long id) {
        var enseignantOptional= enseignantRepository.findById(id);
        if (enseignantOptional.isPresent()){
            var enseignant=enseignantOptional.get();
            return new Enseignant(
                enseignant.getId(),
                enseignant.getPrenom(),
                enseignant.getNom(),
                enseignant.getEmail(),
                enseignant.getTelephone(),
                enseignant.getNaissance(),
                enseignant.getERole(),
                enseignant.getESpecialite(),
                enseignant.getIdentifiantEnseignant()
            );
            
        }
        return null;    }

    @Override
    public EnseignantResponse createEnseignant(Enseignant enseignant) {
        Enseignant nouvelEnseignant = new Enseignant();
        nouvelEnseignant.setEmail(enseignant.getEmail());
        nouvelEnseignant.setNom(enseignant.getNom());
        nouvelEnseignant.setPrenom(enseignant.getPrenom());
        nouvelEnseignant.setERole(ERole.ENSEIGNAT);
        nouvelEnseignant.setNaissance(enseignant.getNaissance());
        nouvelEnseignant.setTelephone(enseignant.getTelephone());
        nouvelEnseignant.setPassword(passwordEncoder.encode(enseignant.getPassword()));
        nouvelEnseignant.setIdentifiantEnseignant("E"+utils.generateCodePin());
        nouvelEnseignant.setESpecialite(ESpecialite.CYBERSECURITY);
        nouvelEnseignant.setStatus(EStatus.DESACTIVE);
        enseignantRepository.save(nouvelEnseignant);
        return new EnseignantResponse(Status.OK);
    }

    @Override
    public EnseignantResponse updateEnseignant(long id, EnseignantRequest enseignantRequest) {
        var enseignantOptional = enseignantRepository.findById(id);
        if (enseignantOptional.isPresent()){
            var enseignantRes = enseignantOptional.get();
            enseignantRes.setPrenom(enseignantRequest.getPrenom());
            enseignantRes.setNom(enseignantRequest.getNom());
            enseignantRes.setIdentifiantEnseignant(enseignantRes.getIdentifiantEnseignant());
            enseignantRes.setTelephone(enseignantRequest.getTelephone());
            enseignantRes.setNaissance(enseignantRequest.getNaissance());
/*          enseignantRes.setERole(enseignantRequest.getERole());
*/
            enseignantRes.setEmail(enseignantRequest.getEmail());
            enseignantRepository.save(enseignantRes);
            return new EnseignantResponse(Status.OK);
        }
        return new EnseignantResponse(Status.NOT_FOUND_OTHER_USER);
    }

    @Override
    public EnseignantResponse deleteEnseignant(long id) {
        var enseignantOptional=enseignantRepository.findById(id);
        if (enseignantOptional.isPresent()){
            enseignantRepository.deleteById(id);
            return new EnseignantResponse(Status.OK);
        }
        return new EnseignantResponse(Status.KO);
    }    
}

