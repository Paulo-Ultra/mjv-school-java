package com.mjv.projetofinal.repositories;

import com.mjv.projetofinal.model.cadastro.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
