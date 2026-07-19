package com.duoc.backend.controller;

import com.duoc.backend.model.Pedido;
import com.duoc.backend.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {
    
    @Autowired
    private PedidoService service;

    @PostMapping
    public ResponseEntity<Pedido> crear(@RequestBody Pedido pedido) {
        return new ResponseEntity<>(service.registrarPedido(pedido), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Pedido>> listar() {
        return new ResponseEntity<>(service.listarPedidos(), HttpStatus.OK);
    }
}