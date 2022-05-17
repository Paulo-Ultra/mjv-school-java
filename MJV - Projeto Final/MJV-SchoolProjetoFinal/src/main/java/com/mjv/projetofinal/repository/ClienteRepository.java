package com.mjv.projetofinal.repository;

import com.mjv.projetofinal.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
