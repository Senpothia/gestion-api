package com.michel.gestionapi.model.auxiliary;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.michel.gestionapi.model.Operation;

public class CategorieAux {

	private Integer id;
	private String nom;
	private List<Operation> operations;

}
