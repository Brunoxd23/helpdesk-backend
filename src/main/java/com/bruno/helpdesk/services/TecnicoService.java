package com.bruno.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bruno.helpdesk.domain.Tecnico;
import com.bruno.helpdesk.repositories.TecnicoRepository;
import com.bruno.helpdesk.services.exceptions.ObjectNotFoundException;

@Service
public class TecnicoService {

	@Autowired
	private TecnicoRepository repository;

	public Tecnico finById(Integer id) {
		Optional<Tecnico> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não Encontrado! Id: " + id));
	}

	public List<Tecnico> findAll() {
		return repository.findAll();
	}
}
