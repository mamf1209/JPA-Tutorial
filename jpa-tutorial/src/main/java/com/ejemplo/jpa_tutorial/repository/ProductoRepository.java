package com.ejemplo.jpa_tutorial.repository;

import com.ejemplo.jpa_tutorial.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    List<Producto> findByNombre(String nombre);

    @Query("SELECT p FROM Producto p WHERE p.precio BETWEEN :preciomin AND :preciomax")
    List<Producto> findByPrecioBetween(@Param("preciomin") Double preciomin, @Param("preciomax") Double preciomax);
}
