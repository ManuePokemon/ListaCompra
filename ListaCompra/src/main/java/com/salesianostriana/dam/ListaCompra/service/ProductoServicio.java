package com.salesianostriana.dam.ListaCompra.service;

import com.salesianostriana.dam.ListaCompra.model.Producto;
import com.salesianostriana.dam.ListaCompra.repo.ProductoRepositorio;
import com.salesianostriana.dam.ListaCompra.service.base.ServicioBaseImpl;
import org.springframework.stereotype.Service;

@Service
public class ProductoServicio extends ServicioBaseImpl<Producto, Long, ProductoRepositorio> {

}
