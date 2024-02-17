package com.valdir.helpdeskbackend;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.valdir.helpdeskbackend.domain.Chamado;
import com.valdir.helpdeskbackend.domain.Cliente;
import com.valdir.helpdeskbackend.domain.Tecnico;
import com.valdir.helpdeskbackend.domain.enums.Perfil;
import com.valdir.helpdeskbackend.domain.enums.Prioridade;
import com.valdir.helpdeskbackend.domain.enums.Status;
import com.valdir.helpdeskbackend.repositories.ChamadoRepository;
import com.valdir.helpdeskbackend.repositories.ClienteRepository;
import com.valdir.helpdeskbackend.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskBackendApplication implements CommandLineRunner {

	@Autowired
	private TecnicoRepository tecnicoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public HelpdeskBackendApplication() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelpdeskBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Tecnico tec1 = new Tecnico(null, "Valdir Cezar", "63653230268", "valdir@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Linus Torvalds", "80527954780", "torvalds@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
