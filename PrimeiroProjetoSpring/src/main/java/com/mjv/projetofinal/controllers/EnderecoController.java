package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.cadastro.Endereco;
import com.mjv.projetofinal.model.cadastro.Produto;
import com.mjv.projetofinal.repositories.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {


        @Autowired
        private EnderecoRepository repository;
        @PostMapping
        public void gravar(@RequestBody Endereco endereco){
            repository.save(endereco);
        }
        @GetMapping
        public List<Endereco> listar() {
            return repository.findAll();
        }
    @DeleteMapping
    public void deletar(@RequestBody Endereco endereco) {
        repository.delete(endereco);
    }
}
