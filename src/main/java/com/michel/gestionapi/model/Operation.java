package com.michel.gestionapi.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Operation {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	private Compte compte;

	@Column(precision = 9, scale = 2)
	private float montant;

	private LocalDateTime date;

	@ManyToOne
	private Categorie categorie;

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Integer id, Compte compte, float montant, LocalDateTime date, Categorie categorie) {
		super();
		this.id = id;
		this.compte = compte;
		this.montant = montant;
		this.date = date;
		this.categorie = categorie;
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

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

}
