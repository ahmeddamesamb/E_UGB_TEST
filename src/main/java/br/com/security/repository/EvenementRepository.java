package br.com.security.repository;

import br.com.security.model.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface EvenementRepository extends JpaRepository<Evenement,Long> {
}
