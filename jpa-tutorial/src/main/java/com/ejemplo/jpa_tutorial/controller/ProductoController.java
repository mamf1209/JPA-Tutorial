package com.ejemplo.jpa_tutorial.controller;

import com.ejemplo.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> findAll() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Producto> findById(@PathVariable Integer id) {
        return productoService.findById(id);
    }

    @GetMapping("/search")
    public List<Producto> findByNombre(@RequestParam String nombre) {
        return productoService.findByNombre(nombre);
    }

    @GetMapping("/searchByPrecio")
    public List<Producto> findByPrecio(@RequestParam Double preciomin, @RequestParam Double preciomax) {
        return productoService.findByPrecio(preciomin, preciomax);
    }

    @PostMapping
    public Producto save(@RequestBody Producto producto) {
        return productoService.save(producto);
    }

}
