package com.mjv.projetofinal.repositories;

import com.mjv.projetofinal.model.pedido.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
