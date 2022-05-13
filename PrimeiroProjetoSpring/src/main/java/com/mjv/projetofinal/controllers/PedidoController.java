package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.cadastro.Produto;
import com.mjv.projetofinal.model.pedido.Pedido;
import com.mjv.projetofinal.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {


        @Autowired
        //repositorio
        private PedidoRepository repository;
        @PostMapping
        public void gravar(@RequestBody Pedido pedido){
            repository.save(pedido);
        }
        @GetMapping
        public List<Pedido> listar() {
            return repository.findAll();
    }
    @DeleteMapping
    public void deletar(@RequestBody Pedido pedido) {
        repository.delete(pedido);
    }
}
