package com.hackaboss.clientes.controller;

import com.hackaboss.clientes.entity.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> obtenerTodos() {
        return Arrays.asList(
                new Cliente(1L, "Cliente 1", "correo1@correo.com"),
                new Cliente(2L, "Cliente 2", "correo2@correo.com"),
                new Cliente(3L, "Cliente 3", "correo3@correo.com")
        );
    }
}
