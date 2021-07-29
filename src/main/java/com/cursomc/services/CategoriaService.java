package com.cursomc.services;

import com.cursomc.domain.Categoria;
import com.cursomc.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired //instancia o objeto automaticamente
    private CategoriaRepository repo;

    public Optional<Categoria> buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);

        return obj;
    }
}
