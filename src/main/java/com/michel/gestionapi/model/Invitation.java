package com.michel.gestionapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Invitation {
	
	@Id
	@GeneratedValue
	private Integer id;
	@ManyToOne
	private Compte compte;
	@ManyToOne
	private Utilisateur invite;
	private String droit;
	
	public Invitation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Invitation(Integer id, Compte compte, Utilisateur invite, String droit) {
		super();
		this.id = id;
		this.compte = compte;
		this.invite = invite;
		this.droit = droit;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Utilisateur getInvite() {
		return invite;
	}

	public void setInvite(Utilisateur invite) {
		this.invite = invite;
	}

	public String getDroit() {
		return droit;
	}

	public void setDroit(String droit) {
		this.droit = droit;
	} 
	
	
	
	
	
	
	

}
