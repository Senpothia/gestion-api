package com.michel.gestionapi.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
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

	@ManyToMany
	@JoinTable(name = "categorisation", joinColumns = @JoinColumn(name = "idOperation"), inverseJoinColumns = @JoinColumn(name = "idCategorie"))
	private Set<Categorie> categories;

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Integer id, Compte compte, float montant, Set<Categorie> categories) {
		super();
		this.id = id;
		this.compte = compte;
		this.montant = montant;
		this.categories = categories;
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

	public Set<Categorie> getCategories() {
		return categories;
	}

	public void setCategories(Set<Categorie> categories) {
		this.categories = categories;
	}



}
