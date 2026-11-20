package com.Gestor.Presupuesto.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipoMovimiento;

    private String descripcion;

    private BigDecimal valor;

    private LocalDate fecha;
}
