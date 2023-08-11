package com.michel.gestionapi.model.auxiliary;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Operation;

public class OperationAux {

	private Integer id;
	private CompteAux compte;
	private float montant;
	private CategorieAux categorie;

	public OperationAux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OperationAux(Integer id, CompteAux compte, float montant, CategorieAux categorie) {
		super();
		this.id = id;
		this.compte = compte;
		this.montant = montant;
		this.categorie = categorie;
	}
	
	public OperationAux(Operation o) {
		super();
		this.id = o.getId();
		CompteAux c = 
		this.compte = new CompteAux(o.getCompte());
		this.montant = o.getMontant();
		this.categorie = new CategorieAux(o.getCategorie());
	}
	

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public CompteAux getCompte() {
		return compte;
	}

	public void setCompte(CompteAux compte) {
		this.compte = compte;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public CategorieAux getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieAux categorie) {
		this.categorie = categorie;
	}

}
