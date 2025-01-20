package com.chackaboss.gestionEmpresarial.controller;

import com.chackaboss.gestionEmpresarial.model.Empleado;
import com.chackaboss.gestionEmpresarial.model.Empresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {

    private List<Empresa> empresas = new ArrayList<>();

    // 1. Agregar una empresa con sus empleados
    // http://localhost:8080/empresas
    @PostMapping
    public Empresa agregarEmpresaConEmpleados(@RequestBody Empresa nuevaEmpresa) {
        empresas.add(nuevaEmpresa);
        return nuevaEmpresa;
    }

    // 2. Devolver una lista de empresas
    // http://localhost:8080/empresas
    @GetMapping
    public List<Empresa> obtenerTodasLasEmpresas() {
        return empresas;
    }

    //3. Devolver una empresa por id
    // http://localhost:8080/empresas/1
    @GetMapping("/{id}")
    public Empresa obtenerEmpresaPorId(@PathVariable Long id) {
        return empresas.stream()
                .filter(empresa -> empresa.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada con el id: " + id));
    }

    //4. Devolver una lista de empleados de una determinada empresa
    // http://localhost:8080/empresas/empleados/1
    @GetMapping("/empleados/{id}")
    public List<Empleado> obtenerEmpleadosPorEmpresa(@PathVariable Long id) {
        return empresas.stream()
                .filter(empresa -> empresa.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Empresa no encontrada con el id: " + id))
                .getEmpleados();
    }
}
