package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.Cliente;
import com.mjv.projetofinal.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteRepository clienteRepository;

    @PostMapping
    public void gravar(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }
    @PutMapping
    public void alterar(@RequestBody Cliente cliente) {
        clienteRepository.save(cliente);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable ("id") Integer id) {
        clienteRepository.deleteById(id);
    }
    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }
    @GetMapping("/{id}")
    public Cliente listarId(@PathVariable ("id") Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }

}
