package com.michel.gestionapi.service;

import java.util.List;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.auxiliary.CategorieAux;

public interface CategorieAbstractService {
	
	
	Categorie getCategorie(Integer id);
	List<Categorie> getAllCategories();
	List<Categorie> getAllCategoriesByCompte(Compte compte);
	
	void createCategorie(CategorieAux categorie);
	void createCategorie(Categorie categorie);
	void deleteCategorie(Categorie categorie);
	void modifyCategorie(CategorieAux categorie);
	
	
	

}
