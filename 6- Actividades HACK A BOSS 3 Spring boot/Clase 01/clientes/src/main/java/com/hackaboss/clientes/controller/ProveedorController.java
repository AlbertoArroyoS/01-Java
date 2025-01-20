package com.hackaboss.clientes.controller;

import com.hackaboss.clientes.entity.Proveedor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProveedorController {

    @GetMapping("/proveedores")
    public List<Proveedor> obtenerTodos() {
        return Arrays.asList(
                new Proveedor(1L, "Proveedor 1", "Empresa 1 S.A."),
                new Proveedor(2L, "Proveedor 2", "Empresa 2 S.A."),
                new Proveedor(3L, "Proveedor 3", "Empresa 3 S.A.")
        );
    }
}