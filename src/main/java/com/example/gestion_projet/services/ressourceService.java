package com.example.gestion_projet.services;

import com.example.gestion_projet.models.Ressource;

import java.util.List;

public interface ressourceService {

    public Ressource ajouterRess(Ressource r);
    public void supprimerRess(Long id);
    public Ressource getById(Long id);
    public List<Ressource> listeRessources();
    public Ressource modifierRess(Ressource r);
    public Ressource getByInfo(String email,String mdp);

}
