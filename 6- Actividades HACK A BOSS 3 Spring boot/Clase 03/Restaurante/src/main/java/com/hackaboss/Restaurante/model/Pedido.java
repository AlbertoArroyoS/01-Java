package com.hackaboss.Restaurante.model;

import java.util.List;

public class Pedido {
    private Long id;
    private List<Plato> platos;
    private String estado;
    private String cliente;

    public Pedido(Long id, List<Plato> platos, String estado, String cliente) {
        this.id = id;
        this.platos = platos;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(List<Plato> platos) {
        this.platos = platos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
}

