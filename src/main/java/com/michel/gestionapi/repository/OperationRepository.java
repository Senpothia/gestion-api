package com.michel.gestionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michel.gestionapi.model.Compte;

public interface OperationRepository extends JpaRepository<Compte, Integer>{

}
