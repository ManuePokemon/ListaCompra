package com.salesianostriana.dam.ListaCompra.repo;

import com.salesianostriana.dam.ListaCompra.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio
        extends JpaRepository<Producto, Long> {
}
