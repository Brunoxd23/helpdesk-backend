package com.bruno.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
