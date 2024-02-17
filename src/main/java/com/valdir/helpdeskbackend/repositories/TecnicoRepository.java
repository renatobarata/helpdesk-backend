package com.valdir.helpdeskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdeskbackend.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
