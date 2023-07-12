package com.michel.gestionapi.service;

import java.util.List;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.auxiliary.CategorieAux;

public interface CategorieAbstractService {
	
	
	Categorie getCategorie(Integer id);
	List<Categorie> getAllCategories();
	List<Categorie> getAllCategoriesByCompte(Compte compte);
	
	int createCategorie(CategorieAux categorie);
	int deleteCategorie(Categorie categorie);
	int modifyCategorie(CategorieAux categorie);
	
	
	

}
