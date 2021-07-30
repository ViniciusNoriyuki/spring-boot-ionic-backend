package com.cursomc.repositories;

import com.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
