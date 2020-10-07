package com.salesianostriana.dam.ListaCompra.controller;

import com.salesianostriana.dam.ListaCompra.service.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio productoServicio;


    @GetMapping("/")
    public String list(Model model){
        return "index";
    }
}
