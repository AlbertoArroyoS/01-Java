package com.hackaboss.Restaurante.controller;

import com.hackaboss.Restaurante.model.Pedido;
import com.hackaboss.Restaurante.model.Plato;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/restaurante")
public class RestauranteController {

    private List<Plato> menu = new ArrayList<>();
    private Map<Long, Pedido> pedidos = new HashMap<>();
    private Long pedidoId = 1L;

    @GetMapping("/menu")
    public List<Plato> getMenu() {
        return menu;
    }

    @GetMapping("/pedido/{id}")
    public Pedido getPedido(@PathVariable Long id) {
        return pedidos.get(id);
    }

    @PostMapping("/pedido")
    public Pedido realizarPedido(@RequestBody List<Plato> platosPedido) {
        Pedido nuevoPedido = new Pedido(pedidoId++, platosPedido, "En preparación", "Cliente");
        pedidos.put(nuevoPedido.getId(), nuevoPedido);
        return nuevoPedido;
    }

    @PostMapping("/menu/agregar")
    public Plato agregarPlatoAlMenu(@RequestBody Plato nuevoPlato) {
        nuevoPlato.setId((long) (menu.size() + 1));
        menu.add(nuevoPlato);
        return nuevoPlato;
    }
}
