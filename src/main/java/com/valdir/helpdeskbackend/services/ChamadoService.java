package com.valdir.helpdeskbackend.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valdir.helpdeskbackend.domain.Chamado;
import com.valdir.helpdeskbackend.repositories.ChamadoRepository;
import com.valdir.helpdeskbackend.services.exceptions.ObjectNotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado. Id: " + id));
	}
}
