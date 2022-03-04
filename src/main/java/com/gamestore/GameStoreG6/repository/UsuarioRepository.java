package com.gamestore.GameStoreG6.repository;

import java.util.Optional;

import com.gamestore.GameStoreG6.model.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long>{
    public Optional<UsuarioModel> findByUsuario(String usuario);
}
