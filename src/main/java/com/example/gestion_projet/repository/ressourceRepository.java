package com.example.gestion_projet.repository;

import com.example.gestion_projet.models.Ressource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ressourceRepository extends JpaRepository<Ressource, Long> {

    @Query("SELECT r FROM Ressource r WHERE r.email= :email AND r.mdp= :mdp ")
    public Ressource findByInfo(@Param(value = "email") String email, @Param(value = "mdp") String mdp);

}
