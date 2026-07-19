package com.duoc.backend.service;

import com.duoc.backend.model.Usuario;
import com.duoc.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired(required = false)
    private UsuarioRepository repository;

    // C del CRUD (Crear)
    public Usuario registrarUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    // R del CRUD (Leer todos)
    public List<Usuario> listarUsuarios() {
        return repository.findAll();
    }
}