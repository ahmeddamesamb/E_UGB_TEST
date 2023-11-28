package br.com.security.repository;

import br.com.security.model.Remarque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemarqueRepository extends JpaRepository<Remarque,Long> {
}
