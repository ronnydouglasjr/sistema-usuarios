package com.ronnysoares.sistema_usuarios.infrasctruture.repository;

import com.ronny.javanauta.infrastructure.entity.TelefoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneEntity, Long> {
}
