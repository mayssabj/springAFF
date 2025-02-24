package tn.esprit.newpro.service;

import tn.esprit.newpro.entity.Equipe;
import tn.esprit.newpro.entity.ProjetDetails;

import java.util.List;

public interface IProjetDetailsService {
    public List<ProjetDetails> retrieveAllProjetDetails();
    public ProjetDetails retrieveProjetDetails(Long blocId);
    public ProjetDetails addProjetDetails(ProjetDetails b);
    public void removeProjetDetails(Long blocId);
    public ProjetDetails modifyProjetDetails(ProjetDetails bloc);
}
