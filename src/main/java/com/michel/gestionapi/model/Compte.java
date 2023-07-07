package com.michel.gestionapi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Compte {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nom;
	private String reference;
	
	@ManyToOne
	private Utilisateur proprietaire;

	@OneToMany(mappedBy = "compte")
	private List<Operation> operations;
	
	
	@OneToMany(mappedBy = "compte")
	private List<Regle> regles;


	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Compte(Integer id, String nom, String reference, Utilisateur proprietaire, List<Operation> operations,
			List<Regle> regles) {
		super();
		this.id = id;
		this.nom = nom;
		this.reference = reference;
		this.proprietaire = proprietaire;
		this.operations = operations;
		this.regles = regles;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public Utilisateur getProprietaire() {
		return proprietaire;
	}


	public void setProprietaire(Utilisateur proprietaire) {
		this.proprietaire = proprietaire;
	}


	public List<Operation> getOperations() {
		return operations;
	}


	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}


	public List<Regle> getRegles() {
		return regles;
	}


	public void setRegles(List<Regle> regles) {
		this.regles = regles;
	}
	
	
	
	
	
}
