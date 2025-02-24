package tn.esprit.newpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.newpro.entity.Projet;
@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
