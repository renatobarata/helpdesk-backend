package com.valdir.helpdeskbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valdir.helpdeskbackend.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
