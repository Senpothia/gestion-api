package com.michel.gestionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.gestionapi.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

	Categorie findByNom(String nomCategorie);

}
