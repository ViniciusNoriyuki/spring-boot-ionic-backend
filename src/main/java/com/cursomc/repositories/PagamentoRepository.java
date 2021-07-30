package com.cursomc.repositories;

import com.cursomc.domain.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
