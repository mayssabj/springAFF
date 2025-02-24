package tn.esprit.newpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.newpro.entity.Equipe;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {
}
