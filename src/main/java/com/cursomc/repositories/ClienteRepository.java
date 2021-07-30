package com.cursomc.repositories;

import com.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
