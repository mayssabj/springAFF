package tn.esprit.newpro.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.newpro.entity.ProjetDetails;
import tn.esprit.newpro.repository.EquipeRepository;
import tn.esprit.newpro.repository.ProjetDetailsRepository;

import java.util.List;
@Service
@RequiredArgsConstructor
public class ProjetDetailsServiceImpl implements IProjetDetailsService {
    @Autowired
    ProjetDetailsRepository projetDetailsRepository;
    @Override
    public List<ProjetDetails> retrieveAllProjetDetails() {
        return projetDetailsRepository.findAll();
    }

    @Override
    public ProjetDetails retrieveProjetDetails(Long blocId) {
        return projetDetailsRepository.findById(blocId).get();
    }

    @Override
    public ProjetDetails addProjetDetails(ProjetDetails b) {
        return projetDetailsRepository.save(b);
    }

    @Override
    public void removeProjetDetails(Long blocId) {
        projetDetailsRepository.deleteById(blocId);
    }

    @Override
    public ProjetDetails modifyProjetDetails(ProjetDetails bloc) {
        return projetDetailsRepository.save(bloc);
    }
}
