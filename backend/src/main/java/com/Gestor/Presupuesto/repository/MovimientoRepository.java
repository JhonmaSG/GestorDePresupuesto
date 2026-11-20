package com.Gestor.Presupuesto.repository;

import com.Gestor.Presupuesto.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MovimientoRepository extends JpaRepository<Movimiento, UUID> {
}
