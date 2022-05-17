package com.mjv.projetofinal.repository;

import com.mjv.projetofinal.model.LocacaoItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.temporal.ChronoUnit;

public interface LocacaoItemRepository extends JpaRepository<LocacaoItem, Integer> {

}
