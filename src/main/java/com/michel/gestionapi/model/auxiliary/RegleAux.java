package com.michel.gestionapi.model.auxiliary;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Regle;

public class RegleAux {


	private Integer id;
	private CompteAux compte;
	private CategorieAux categorie;
	private float valeur;
	
	public RegleAux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegleAux(Integer id, CompteAux compte, CategorieAux categorie, float valeur) {
		super();
		this.id = id;
		this.compte = compte;
		this.categorie = categorie;
		this.valeur = valeur;
	}
	
	
	public RegleAux(Regle r) {
		
		this.id = r.getId();
		this.compte = CompteAux(r.getCompte());
		this.categorie = new CategorieAux(r.getCategorie());
		this.valeur = r.getValeur();
	}



	private CompteAux CompteAux(Compte compte2) {
		// TODO Auto-generated method stub
		return null;
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

	public CategorieAux getCategorie() {
		return categorie;
	}

	public void setCategorie(CategorieAux categorie) {
		this.categorie = categorie;
	}

	public float getValeur() {
		return valeur;
	}

	public void setValeur(float valeur) {
		this.valeur = valeur;
	}
	
	
	
	
	

}
