package tn.esprit.newpro.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.newpro.entity.Equipe;
import tn.esprit.newpro.entity.Projet;
import tn.esprit.newpro.entity.ProjetDetails;
import tn.esprit.newpro.repository.EquipeRepository;
import tn.esprit.newpro.repository.ProjetDetailsRepository;
import tn.esprit.newpro.repository.ProjetRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProjetServiceImpl implements IProjetService {
    @Autowired
    ProjetRepository projetRepository;
    @Autowired
    private ProjetDetailsRepository projetDetailsRepository;
    @Autowired
    EquipeRepository equipeRepository ;

    @Override
    public List<Projet> retrieveAllProjet() {
        return projetRepository.findAll();
    }

    @Override
    public Projet retrieveProjet(Long blocId) {
        return projetRepository.findById(blocId).get();
    }

    @Override
    public Projet addProjet(Projet b) {
        return projetRepository.save(b);
    }

    @Override
    public void removeProjet(Long blocId) {
        projetRepository.deleteById(blocId);
    }

    @Override
    public Projet modifyProjet(Projet bloc) {
        return projetRepository.save(bloc);
    }
    @Override
    public Projet addProjetAndProjetDetailAndAssign(Projet projet) {
        return projetRepository.save(projet);
    }
    @Override
    public void assignProjetDetailToProjet(Long projetId, Long projetDetailId) {
        Projet projet = projetRepository.findById(projetId).get();
        ProjetDetails projetDetail = projetDetailsRepository.findById(projetDetailId).get();
// on set le fils dans le parent :
        projet.setProjetdetails(projetDetail);
        projetRepository.save(projet);
    }
    @Override
    public void assignProjetToEquipe(Long projetId, Long equipeId) {
        Projet projet = projetRepository.findById(projetId).get();
        Equipe equipe = equipeRepository.findById(equipeId).get();
// on set le fils dans le parent :
        equipe.getProjets().add(projet);
        equipeRepository.save(equipe);
    }

}
