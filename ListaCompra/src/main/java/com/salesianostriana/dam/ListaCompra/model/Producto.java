package com.salesianostriana.dam.ListaCompra.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data@Builder
@NoArgsConstructor@AllArgsConstructor
public class Producto {

    @Id
    @GeneratedValue
    private long id;

    private String nombre;
    private double precio;
    private int unidadesEnStock;
    private String observacion;
    private boolean estaEnCesta;

}
