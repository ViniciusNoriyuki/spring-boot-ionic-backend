package com.cursomc.repositories;

import com.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
