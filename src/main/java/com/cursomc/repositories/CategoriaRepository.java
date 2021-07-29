package com.cursomc.repositories;

import com.cursomc.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
