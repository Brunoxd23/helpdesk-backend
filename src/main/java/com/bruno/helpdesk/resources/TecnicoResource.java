package com.bruno.helpdesk.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bruno.helpdesk.domain.Tecnico;
import com.bruno.helpdesk.domain.dtos.TecnicoDTO;
import com.bruno.helpdesk.services.TecnicoService;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoResource {

	// localhost:8080/tecnicos/1

	@Autowired
	private TecnicoService service;

	@GetMapping(value = "/{id}")
	public ResponseEntity<TecnicoDTO> findByEntity(@PathVariable Integer id) {
		Tecnico obj = service.finById(id);
		return ResponseEntity.ok().body(new TecnicoDTO(obj));
	}

	@GetMapping
	public ResponseEntity<List<TecnicoDTO>> findAll() {
		List<Tecnico> list = service.findAll();
		List<TecnicoDTO> listDTO = list.stream().map(obj -> new TecnicoDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok(listDTO);
	}
}
