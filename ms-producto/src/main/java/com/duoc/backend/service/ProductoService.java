package com.duoc.backend.service;

import com.duoc.backend.model.Producto;
import com.duoc.backend.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository repository;

    public Producto registrarProducto(Producto producto) {
        return repository.save(producto);
    }

    public List<Producto> listarProductos() {
        return repository.findAll();
    }
}