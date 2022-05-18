package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.Locacao;
import com.mjv.projetofinal.repository.LocacaoRepository;
import com.mjv.projetofinal.services.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/locacao")
public class LocacaoController {

        @Autowired
        private LocacaoRepository locacaoRepository;

        @Autowired
        private LocacaoService locacaoService;

        @PostMapping
        public void calcularLocacao(@RequestBody Locacao locacao) {
        locacaoService.gravar(locacao);
        }
        @PutMapping
        public void alterar(@RequestBody Locacao locacao) {
        locacaoRepository.save(locacao);
    }
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable ("id") Integer id) {
            locacaoRepository.deleteById(id);
        }
        @GetMapping
        public List<Locacao> listar() {
        return locacaoRepository.findAll();
    }
        @GetMapping("/{id}")
        public Locacao listarId(@PathVariable ("id") Integer id) {
        return locacaoRepository.findById(id).orElse(null);
        }

}
