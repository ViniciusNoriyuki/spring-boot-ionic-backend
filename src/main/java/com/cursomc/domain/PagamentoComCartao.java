package com.cursomc.domain;

import com.cursomc.domain.enums.EstadoPagamento;

import javax.persistence.Entity;

@Entity
public class PagamentoComCartao extends Pagamento{

    private static final long serialVersionUID = 1L;

    private Integer NumeroDeParcelas;

    public PagamentoComCartao() {
    }

    public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
        super(id, estado, pedido);
        this.NumeroDeParcelas = numeroDeParcelas;
    }

    public Integer getNumeroDeParcelas() {
        return NumeroDeParcelas;
    }

    public void setNumeroDeParcelas(Integer numeroDeParcelas) {
        NumeroDeParcelas = numeroDeParcelas;
    }
}
