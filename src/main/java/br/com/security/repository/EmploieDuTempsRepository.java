package br.com.security.repository;

import br.com.security.model.EmploieDuTemps;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmploieDuTempsRepository extends JpaRepository<EmploieDuTemps,Long> {
}
