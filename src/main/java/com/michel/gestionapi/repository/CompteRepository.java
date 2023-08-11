package com.michel.gestionapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Utilisateur;

public interface CompteRepository extends JpaRepository<Compte, Integer>{

	List<Compte> findByProprietaire(Utilisateur u);

	

}
