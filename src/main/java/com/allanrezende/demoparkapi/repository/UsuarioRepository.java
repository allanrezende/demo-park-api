package com.allanrezende.demoparkapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allanrezende.demoparkapi.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
}
