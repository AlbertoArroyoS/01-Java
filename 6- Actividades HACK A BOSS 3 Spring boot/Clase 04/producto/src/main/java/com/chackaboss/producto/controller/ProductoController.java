package com.chackaboss.producto.controller;

import com.chackaboss.producto.model.Producto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    // Lista de productos simulada
    private final List<Producto> productos = new ArrayList<>();

    @PostConstruct
    public void init() {
        productos.add(new Producto(1L, "Ordenador"));
        productos.add(new Producto(2L, "Teléfono"));
        productos.add(new Producto(3L, "Tablet"));
    }

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        // Buscar el producto por ID
        Optional<Producto> productoOptional = productos.stream()
                .filter(p -> p.getId() == id)
                .findFirst();

        // Devolver el nombre del producto o mensaje de no encontrado
        return productoOptional.map(Producto::getNombre)
                .orElse("Producto no encontrado");
    }

}
