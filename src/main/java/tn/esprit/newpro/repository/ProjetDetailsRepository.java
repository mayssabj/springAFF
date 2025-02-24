package tn.esprit.newpro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.newpro.entity.ProjetDetails;
@Repository
public interface ProjetDetailsRepository extends JpaRepository<ProjetDetails, Long> {
}
