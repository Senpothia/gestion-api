package com.michel.gestionapi.model.auxiliary;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.michel.gestionapi.model.Categorie;
import com.michel.gestionapi.model.Operation;

public class CategorieAux {

	private Integer id;
	private String nom;
	private List<OperationAux> operations;
	
	public CategorieAux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CategorieAux(Integer id, String nom, List<OperationAux> operations) {
		super();
		this.id = id;
		this.nom = nom;
		this.operations = operations;
	}
	
	public CategorieAux(Categorie c) {
	
		this.id = c.getId();
		this.nom = c.getNom();
		this.operations = AuxiliaryUtils.makeListOperationsAux(c.getOperations());
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

	public List<OperationAux> getOperations() {
		return operations;
	}

	public void setOperations(List<OperationAux> operations) {
		this.operations = operations;
	}
	
	
	
	
	

}
