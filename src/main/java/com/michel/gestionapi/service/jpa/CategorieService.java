package com.michel.gestionapi.service.jpa;

import java.util.List;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.auxiliary.CategorieAux;
import com.michel.gestionapi.service.CategorieAbstractService;

public class CategorieService implements CategorieAbstractService {

	@Override
	public Categorie getCategorie(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categorie> getAllCategoriesByCompte(Compte compte) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int createCategorie(CategorieAux categorie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyCategorie(CategorieAux categorie) {
		// TODO Auto-generated method stub
		return 0;
	}



}
