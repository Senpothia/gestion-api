package com.michel.gestionapi.model;

import java.util.List;

import javax.persistence.Column;
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
	@Column(unique=true)
	private String nom;
	@Column(unique=true)
	private String reference;
	
	@Column(precision = 2, scale = 5)
	private float solde;

	@ManyToOne
	private Utilisateur proprietaire;

	@OneToMany(mappedBy = "compte")
	private List<Operation> operations;

	@OneToMany(mappedBy = "compte")
	private List<Regle> regles;

	@OneToMany(mappedBy = "compte")
	private List<Invitation> invitations;

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Compte(Integer id, String nom, String reference, float solde, Utilisateur proprietaire,
			List<Operation> operations, List<Regle> regles, List<Invitation> invitations) {
		super();
		this.id = id;
		this.nom = nom;
		this.reference = reference;
		this.solde = solde;
		this.proprietaire = proprietaire;
		this.operations = operations;
		this.regles = regles;
		this.invitations = invitations;
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

	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
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

	public List<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<Invitation> invitations) {
		this.invitations = invitations;
	}
	
	

	
}
