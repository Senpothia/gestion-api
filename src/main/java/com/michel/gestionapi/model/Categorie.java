package com.michel.gestionapi.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Categorie {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(unique = true)
	private String nom;

	@OneToMany(mappedBy = "categorie")
	private List<Operation> operations;

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Integer id, String nom, List<Operation> operations) {
		super();
		this.id = id;
		this.nom = nom;
		this.operations = operations;
	}
	
	public Categorie(String nom) {
		
		super();
		this.nom = nom;
		
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

	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

}
