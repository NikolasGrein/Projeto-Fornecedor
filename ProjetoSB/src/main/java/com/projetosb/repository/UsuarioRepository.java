package com.projetosb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosb.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}