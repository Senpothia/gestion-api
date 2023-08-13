package com.michel.gestionapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.gestionapi.model.Compte;
import com.michel.gestionapi.model.Operation;

public interface OperationRepository extends JpaRepository<Operation, Integer>{

	List<Operation> findByCompte(Compte compte);

}
