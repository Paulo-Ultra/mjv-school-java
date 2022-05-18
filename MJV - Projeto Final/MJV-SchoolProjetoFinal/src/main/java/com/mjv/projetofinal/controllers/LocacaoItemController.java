package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.LocacaoItem;
import com.mjv.projetofinal.repository.LocacaoItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/locacao_item")
public class LocacaoItemController {

        @Autowired
        private LocacaoItemRepository locacaoItemRepository;

        @PostMapping
        public void gravar(@RequestBody LocacaoItem locacaoItem) {
                locacaoItemRepository.save(locacaoItem);
        }
        @PutMapping
        public void alterar(@RequestBody LocacaoItem locacaoItem) {
                locacaoItemRepository.save(locacaoItem);
        }
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable ("id") Integer id) {
                locacaoItemRepository.deleteById(id);
        }
        @GetMapping
        public List<LocacaoItem> listar() {
                return locacaoItemRepository.findAll();
        }
        @GetMapping("/{id}")
        public LocacaoItem listarId(@PathVariable ("id") Integer id) {
                return locacaoItemRepository.findById(id).orElse(null);
        }
}

