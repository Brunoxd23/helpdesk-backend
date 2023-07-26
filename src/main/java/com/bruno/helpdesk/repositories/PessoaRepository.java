package com.bruno.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}
