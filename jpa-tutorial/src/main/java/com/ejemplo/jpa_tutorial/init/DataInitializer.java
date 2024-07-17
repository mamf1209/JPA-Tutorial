package com.ejemplo.jpa_tutorial.init;

import com.ejemplo.jpa_tutorial.model.Producto;
import com.ejemplo.jpa_tutorial.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProductoRepository productoRepository;

    @Autowired
    public DataInitializer(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void run(String... args) {
        // Cargar datos de prueba
        productoRepository.save(new Producto("Laptop", "Laptop de alta gama", 1500.00));
        productoRepository.save(new Producto("Smartphone", "Smartphone con cámara de 48MP", 700.00));
        productoRepository.save(new Producto("Monitor", "Monitor 4K de 27 pulgadas", 300.00));
        productoRepository.save(new Producto("Teclado", "Teclado mecánico retroiluminado", 100.00));
        productoRepository.save(new Producto("Mouse", "Mouse inalámbrico ergonómico", 50.00));
    }
}
