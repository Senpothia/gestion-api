package com.michel.gestionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.gestionapi.model.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer> {

}
