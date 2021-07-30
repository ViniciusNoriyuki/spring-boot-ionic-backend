package com.cursomc.resources;

import com.cursomc.domain.Pedido;
import com.cursomc.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {

        /*
        ResponseEntity é um tipo especial do Spring que já encapsula várias informações
            de uma resposta HTTP para um serviço Rest.
         */

        Pedido obj = service.buscar(id);

        return ResponseEntity.ok().body(obj);
    }

}
