package com.valdir.helpdeskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdeskbackend.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
