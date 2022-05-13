package com.mjv.projetofinal.repositories;

import com.mjv.projetofinal.model.cadastro.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
