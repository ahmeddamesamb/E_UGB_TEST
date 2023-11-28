package br.com.security.repository;

import br.com.security.model.ClubEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubEtudiantRepository extends JpaRepository<ClubEtudiant,Long> {
}
