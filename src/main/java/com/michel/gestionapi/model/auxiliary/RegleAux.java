package com.michel.gestionapi.model.auxiliary;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;

public class RegleAux {

	private Integer id;
	private CompteAux compte;
	private CategorieAux categorie;
	private float valeur;

}
