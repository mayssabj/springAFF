package tn.esprit.newpro.service;

import tn.esprit.newpro.entity.Equipe;
import tn.esprit.newpro.entity.ProjetDetails;

import java.util.List;

public interface IEquipeService {
    public List<Equipe> retrieveAllEquipe();
    public Equipe retrieveEquipe(Long blocId);
    public Equipe addEquipe(Equipe b);
    public void removeEquipe(Long blocId);
    public Equipe modifyEquipe(Equipe bloc);
}
