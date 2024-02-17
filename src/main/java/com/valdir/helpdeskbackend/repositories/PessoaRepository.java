package com.valdir.helpdeskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdeskbackend.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
