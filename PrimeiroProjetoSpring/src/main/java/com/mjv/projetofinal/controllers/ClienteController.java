package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.cadastro.Cliente;
import com.mjv.projetofinal.model.cadastro.Produto;
import com.mjv.projetofinal.repositories.ClienteRepository;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    //repositorio
    private ClienteRepository repository;
    @PostMapping
    public void gravar(@RequestBody Cliente cliente){
        repository.save(cliente);
    }
    @GetMapping
    public List<Cliente> listar() {
        return repository.findAll();
    }
    @DeleteMapping
    public void deletar(@RequestBody Cliente cliente) {
        repository.delete(cliente);
    }

}
