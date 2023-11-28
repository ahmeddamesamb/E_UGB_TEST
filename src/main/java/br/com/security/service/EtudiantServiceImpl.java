package br.com.security.service;

import br.com.security.model.ERole;
import br.com.security.model.Etudiant;
import br.com.security.payload.request.etudiant.EtudiantRequest;
import br.com.security.payload.response.etudiant.EtudiantResponse;
import br.com.security.repository.EtudiantRepository;
import br.com.security.utils.EStatus;
import br.com.security.utils.Status;
import br.com.security.utils.UtilsImpl;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

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
                etudiant.getStatus(),
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
        nouvelEtudiant.setStatus(EStatus.DESACTIVE);
        etudiantRepository.save(nouvelEtudiant);
        return new EtudiantResponse(Status.OK);
    }

    @Override
    public EtudiantResponse updateEtudiant(long id, EtudiantRequest etudiantRequest) {
    var etudiantOptional = etudiantRepository.findById(id);
    if (etudiantOptional.isPresent()){
        var etudiantRes = etudiantOptional.get();
        etudiantRes.setPrenom(etudiantRequest.getPrenom());
        etudiantRes.setNom(etudiantRequest.getNom());
        etudiantRes.setIdentifiantEtudiant(etudiantRequest.getIdentifiantEtudiant());
        etudiantRes.setTelephone(etudiantRequest.getTelephone());
        etudiantRes.setNaissance(etudiantRequest.getNaissance());
/*
        etudiantRes.setERole(etudiantRequest.getERole());
*/
        etudiantRes.setEmail(etudiantRequest.getEmail());
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
