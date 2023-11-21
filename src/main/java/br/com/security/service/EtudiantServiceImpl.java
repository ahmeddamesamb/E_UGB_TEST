package br.com.security.service;

import br.com.security.model.ERole;
import br.com.security.model.Etudiant;
import br.com.security.model.Passager;
import br.com.security.payload.request.etudiant.EtudiantRequest;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.repository.EtudiantRepository;
import br.com.security.utils.Status;
import br.com.security.utils.UtilsImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EtudiantServiceImpl implements EtudiantService{
    private final EtudiantRepository etudiantRepository;
    private final PasswordEncoder passwordEncoder;
    private final UtilsImpl utils;

    public EtudiantServiceImpl(EtudiantRepository etudiantRepository, PasswordEncoder passwordEncoder, UtilsImpl utils) {
        this.etudiantRepository = etudiantRepository;
        this.passwordEncoder = passwordEncoder;
        this.utils = utils;
    }

    @Override
    public List<Etudiant> getAllEtudiants() {
        return etudiantRepository.findAll();
    }
    @Override
    public Etudiant getEtudiantById(long id) {
        var etudiantOptional= etudiantRepository.findById(id);
        if (etudiantOptional.isPresent()){
            var etudiant=etudiantOptional.get();
            return new Etudiant(
                etudiant.getId(),
                etudiant.getIdentifiantEtudiant(),
                etudiant.getPrenom(),
                etudiant.getNom(),
                etudiant.getEmail(),
                etudiant.getTelephone(),
                etudiant.getStatut(),
                etudiant.getNaissance(),
                etudiant.getERole());
        }
        return null;
    } 

    @Override
    public EtudiantResponse createEtudiant(Etudiant etudiant) {
        Etudiant nouvelEtudiant = new Etudiant();
        nouvelEtudiant.setEmail(etudiant.getEmail());
        nouvelEtudiant.setNom(etudiant.getNom());
        nouvelEtudiant.setPrenom(etudiant.getPrenom());
        nouvelEtudiant.setERole(ERole.ETUDIANT);
        nouvelEtudiant.setNaissance(etudiant.getNaissance());
        nouvelEtudiant.setTelephone(etudiant.getTelephone());
        nouvelEtudiant.setPassword(passwordEncoder.encode(etudiant.getPassword()));
        nouvelEtudiant.setIdentifiantEtudiant("P"+utils.generateCodePin());
        nouvelEtudiant.setStatut("ACTIF");
        etudiantRepository.save(etudiant);
        return new EtudiantResponse(Status.OK);
    }

    @Override
    public EtudiantResponse updateEtudiant(long id, Etudiant etudiant) {
    var etudiantOptional = etudiantRepository.findById(id);
    if (etudiantOptional.isPresent()){
        var etudiantRes = etudiantOptional.get();
        etudiantRes.setPrenom(etudiant.getPrenom());
        etudiantRes.setNom(etudiant.getNom());
        etudiantRes.setStatut(etudiant.getStatut());
        etudiantRes.setIdentifiantEtudiant(etudiantRes.getIdentifiantEtudiant());
        etudiantRes.setTelephone(etudiant.getTelephone());
        etudiantRes.setNaissance(etudiant.getNaissance());
        etudiantRes.setERole(etudiant.getERole());
        etudiantRes.setEmail(etudiant.getEmail());
        etudiantRepository.save(etudiantRes);
        return new EtudiantResponse(Status.OK);
    }
    return new EtudiantResponse(Status.NOT_FOUND_OTHER_USER);
  
    }

    @Override
    public EtudiantResponse deleteEtudiant(long id) {
       var etudiantOptional=etudiantRepository.findById(id);
       if (etudiantOptional.isPresent()){
           etudiantRepository.deleteById(id);
           return new EtudiantResponse(Status.OK);
       }
       return new EtudiantResponse(Status.KO);
    }
    
}
