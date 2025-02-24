package tn.esprit.newpro.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.newpro.entity.Projet;
import tn.esprit.newpro.entity.ProjetDetails;
import tn.esprit.newpro.service.IProjetService;

import java.util.List;

@Tag(name="Gestion projets")
@RestController
@AllArgsConstructor
@RequestMapping("/projet")
public class ProjetRestController {
    @Autowired
    IProjetService projetService;
    @Operation(description = "récupérer toutes les projetsdetails de la base de données")
    //http://localhost:8089/newpro/projet/ajouter-projet-et-projet-detail
    @PostMapping("/ajouter-projet-et-projet-detail")
    public Projet addProjetAndProjetDetail(@RequestBody Projet p) {
        Projet projet = projetService.addProjetAndProjetDetailAndAssign(p);
        return projet;
    }
    // http://localhost:8089/newpro/projet/retrieve-all-projet
    @GetMapping("/retrieve-all-projet")
    public List<Projet> getProjet() {
        List<Projet> listProjets = projetService.retrieveAllProjet();
        return listProjets;
    }

    // http://localhost:8089/newpro/projet/retrieve-projet/8
    @GetMapping("/retrieve-projet/{projet-id}")
    public Projet retrieveProjetDetails(@PathVariable("projet-id") Long blId) {
        Projet projet = projetService.retrieveProjet(blId);
        return projet;

    }
    // http://localhost:8089/newpro/projet/add-projet
    @PostMapping("/add-projet")
    public Projet addProjet(@RequestBody Projet b) {
        Projet projet = projetService.addProjet(b);
        return projet;
    }
    // http://localhost:8089/newpro/projet/remove-projet/{projet-id}
    @DeleteMapping("/remove-projet/{projet-id}")
    public void removeProjet(@PathVariable("projet-id") Long blId) {
        projetService.removeProjet(blId);
    }

    // http://localhost:8089/newpro/projet/modify-projet
    @PutMapping("/modify-projet")
    public Projet modifyProjet(@RequestBody Projet b) {
        Projet projet = projetService.modifyProjet(b);
        return projet;
    }
    //http://localhost:8089/tp8/projet/affecter-projet-a-projet-details/1/1
    @PutMapping("/affecter-projet-a-projet-details/{projet-id}/{projet-details-id}")
    public void affecgterProjetAProjetDetail(@PathVariable("projet-id") Long projtId, @PathVariable("projet-details-id") Long proejtDetailsId) {
        projetService.assignProjetDetailToProjet(projtId, proejtDetailsId);
    }
    @PutMapping("/affecter-projet-a-equipe/{projet-id}/{equipe-id}")
    public void affecgterEqupeProjet(@PathVariable("projet-id") Long projtId,
                                            @PathVariable("equipe-id") Long equipeId) {
        projetService.assignProjetToEquipe(projtId, equipeId);
    }

}
