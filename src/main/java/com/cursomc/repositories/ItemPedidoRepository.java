package com.cursomc.repositories;

import com.cursomc.domain.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
