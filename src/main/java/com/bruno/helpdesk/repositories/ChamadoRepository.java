package com.bruno.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
