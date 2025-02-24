package tn.esprit.newpro.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sujet;

    public ProjetDetails getProjetdetails() {
        return projetdetails;
    }

    public void setProjetdetails(ProjetDetails projetdetails) {
        this.projetdetails = projetdetails;
    }

    public Set<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(Set<Equipe> equipes) {
        this.equipes = equipes;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public ProjetDetails projetdetails;
    @ManyToMany(mappedBy = "projets")
    private Set<Equipe> equipes ;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
