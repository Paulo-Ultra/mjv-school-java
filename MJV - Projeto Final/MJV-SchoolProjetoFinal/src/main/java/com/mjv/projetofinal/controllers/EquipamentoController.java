package com.mjv.projetofinal.controllers;

import com.mjv.projetofinal.model.Equipamento;
import com.mjv.projetofinal.repository.EquipamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/equipamento")
public class EquipamentoController {

        @Autowired
        EquipamentoRepository equipamentoRepository;

        @PostMapping
        public void gravar(@RequestBody Equipamento equipamento) {
            equipamentoRepository.save(equipamento);
        }
        @PutMapping
        public void alterar(@RequestBody Equipamento equipamento) {
        equipamentoRepository.save(equipamento);
    }
        @DeleteMapping("/{id}")
        public void deletar(@PathVariable ("id") Integer id) {
            equipamentoRepository.deleteById(id);
        }
        @GetMapping
        public List<Equipamento> listar() {
        return equipamentoRepository.findAll();
    }
        @GetMapping("/{id}")
        public Equipamento listarId(@PathVariable ("id") Integer id) {
        return equipamentoRepository.findById(id).orElse(null);
        }
}
