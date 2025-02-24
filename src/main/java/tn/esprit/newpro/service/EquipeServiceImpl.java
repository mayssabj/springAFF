package tn.esprit.newpro.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.newpro.entity.Equipe;
import tn.esprit.newpro.repository.EquipeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipeServiceImpl implements IEquipeService {
    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipe() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe retrieveEquipe(Long blocId) {
        return equipeRepository.findById(blocId).get();
    }

    @Override
    public Equipe addEquipe(Equipe b) {
        return equipeRepository.save(b);
    }

    @Override
    public void removeEquipe(Long blocId) {
        equipeRepository.deleteById(blocId);
    }

    @Override
    public Equipe modifyEquipe(Equipe bloc) {
        return equipeRepository.save(bloc);
    }
}
