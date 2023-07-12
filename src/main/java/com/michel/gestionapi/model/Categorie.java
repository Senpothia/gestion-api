package com.michel.gestionapi.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(unique=true)
	private String nom;
	
	@ManyToMany(mappedBy = "categories")
	private Set<Operation> operations;

	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Categorie(Integer id, String nom, Set<Operation> operations) {
		super();
		this.id = id;
		this.nom = nom;
		this.operations = operations;
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

	public Set<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}
	
	 
	
	

}
