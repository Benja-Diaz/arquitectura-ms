package com.duoc.backend.controller;

import com.duoc.backend.model.Producto;
import com.duoc.backend.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService service;

    @PostMapping
    public ResponseEntity<Producto> crear(@RequestBody Producto producto) {
        return new ResponseEntity<>(service.registrarProducto(producto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Producto>> listar() {
        return new ResponseEntity<>(service.listarProductos(), HttpStatus.OK);
    }
}