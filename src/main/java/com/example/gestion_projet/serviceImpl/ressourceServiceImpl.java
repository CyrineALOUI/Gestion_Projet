package com.example.gestion_projet.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.example.gestion_projet.models.Ressource;
import com.example.gestion_projet.repository.ressourceRepository;
import com.example.gestion_projet.services.ressourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ressourceServiceImpl implements ressourceService {

    @Autowired
    private ressourceRepository ressourceRepository;

    public Ressource ajouterRess(Ressource r) {
        return this.ressourceRepository.save(r);
    }

    public void  supprimerRess(Long id) {
        this.ressourceRepository.deleteById(id);
    }

    public Ressource getById(Long id) {
        Optional<Ressource> ressources = this.ressourceRepository.findById(id);
        return ressources.isPresent()?ressources.get():null;
    }

    public List<Ressource> listeRessources(){
        return this.ressourceRepository.findAll();
    }

    public Ressource modifierRess(Ressource r) {
        return this.ressourceRepository.save(r);
    }

    @Override
    public Ressource getByInfo(String email,String mdp) {
        return this.ressourceRepository.findByInfo(email,mdp);
    }

}
