package br.com.security.repository;

import br.com.security.model.RessourcesHumaines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RessourcesHumainesRepository extends JpaRepository<RessourcesHumaines,Long> {
}
