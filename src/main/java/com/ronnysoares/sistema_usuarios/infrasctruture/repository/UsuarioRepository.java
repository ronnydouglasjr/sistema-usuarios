package com.ronnysoares.sistema_usuarios.infrasctruture.repository;


import com.ronnysoares.sistema_usuarios.infrasctruture.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    boolean existsByEmail(String email);
    boolean existsByEmailAndIdNot(String email, Long id);


    Optional<UsuarioEntity> findByEmail(String email);
}
