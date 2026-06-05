package com.duoc.backend.service;

import com.duoc.backend.model.Pedido;
import com.duoc.backend.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoService {
    
    @Autowired
    private PedidoRepository repository;

    public Pedido registrarPedido(Pedido pedido) {
        return repository.save(pedido);
    }

    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }
}