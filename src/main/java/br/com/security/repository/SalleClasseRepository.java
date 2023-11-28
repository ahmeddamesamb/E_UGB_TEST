package br.com.security.repository;

import br.com.security.model.SalleClasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleClasseRepository extends JpaRepository<SalleClasse,Long> {
}
