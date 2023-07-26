package com.bruno.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bruno.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
