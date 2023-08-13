package com.michel.gestionapi.model.auxiliary;

import java.util.List;

import com.michel.gestionapi.model.Compte;

public class CompteAux {

	private Integer id;
	private String nom;
	private String reference;
	private float solde;
	private Integer proprietaire;
	private List<OperationAux> operations;
	private List<RegleAux> regles;
	private List<InvitationAux> invitations;

	public CompteAux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CompteAux(Integer id, String nom, String reference, float solde, Integer proprietaire,
			List<OperationAux> operations, List<RegleAux> regles, List<InvitationAux> invitations) {
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

	public CompteAux(Compte compte) {
		
		super();
		this.id = compte.getId();
		this.nom = compte.getNom();
		this.reference = compte.getReference();
		this.solde = compte.getSolde();
		this.proprietaire = compte.getProprietaire().getId();
		/*
		this.operations = AuxiliaryUtils.makeListOperationsAux(compte.getOperations());
		this.regles = AuxiliaryUtils.makeListReglesAux(compte.getRegles());
		this.invitations = AuxiliaryUtils.makeListInvitationAux(compte.getInvitations());
		*/
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

	public Integer getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Integer proprietaire) {
		this.proprietaire = proprietaire;
	}

	public List<OperationAux> getOperations() {
		return operations;
	}

	public void setOperations(List<OperationAux> operations) {
		this.operations = operations;
	}

	public List<RegleAux> getRegles() {
		return regles;
	}

	public void setRegles(List<RegleAux> regles) {
		this.regles = regles;
	}

	public List<InvitationAux> getInvitations() {
		return invitations;
	}

	public void setInvitations(List<InvitationAux> invitations) {
		this.invitations = invitations;
	}

}
