package com.example.gestion_projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.gestion_projet.models.Competence;

public interface competenceRepository extends JpaRepository<Competence, Long>{
}
