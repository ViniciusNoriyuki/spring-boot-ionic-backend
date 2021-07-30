package com.cursomc.repositories;

import com.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
