package com.salesianostriana.dam.ListaCompra.controller;

import com.salesianostriana.dam.ListaCompra.model.Producto;
import com.salesianostriana.dam.ListaCompra.service.ProductoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductoControlador {

    private final ProductoServicio productoServicio;


    @GetMapping("/")
    public String lista(Model model){
        model.addAttribute("lista",productoServicio.findAll());
        return "index";
    }

    @GetMapping("/nuevoProducto")
    public String formularioCrear(Model model) {
        model.addAttribute("producto", new Producto());
        return "nuevoProducto";
    }
    @PostMapping("/crearProducto")
    public String crearProducto(
            @ModelAttribute("producto") Producto producto) {
        productoServicio.save(producto);
        return "redirect:/";
    }
    @GetMapping("/editarProducto")
    public String formularioEditar(Model model, long id) {
        model.addAttribute("producto", productoServicio.findById(id));
        return "editarProducto";
    }
}
