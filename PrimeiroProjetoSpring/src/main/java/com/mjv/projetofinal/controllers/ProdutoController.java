package com.mjv.projetofinal.controllers;



import com.mjv.projetofinal.model.cadastro.Produto;
import com.mjv.projetofinal.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    //repositorio
    private ProdutoRepository repository;

    @PostMapping
    public void gravar(@RequestBody Produto produto) {
        repository.save(produto);
    }

    @GetMapping
    public List<Produto> listar() {
        return repository.findAll();
    }

    @DeleteMapping
    public void deletar(@RequestBody Produto produto) {
        repository.delete(produto);
    }

}
