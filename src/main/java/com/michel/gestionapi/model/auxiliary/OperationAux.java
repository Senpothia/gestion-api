package com.michel.gestionapi.model.auxiliary;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.michel.gestionapi.model.Compte;

public class OperationAux {
	
	

	private Integer id;
	private CompteAux compte;
	private float montant;
	private CategorieAux categorie;
	

}
