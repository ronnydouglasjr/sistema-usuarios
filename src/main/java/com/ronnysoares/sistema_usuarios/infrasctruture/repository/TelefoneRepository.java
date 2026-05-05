package com.ronnysoares.sistema_usuarios.infrasctruture.repository;


import com.ronnysoares.sistema_usuarios.infrasctruture.entity.TelefoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<TelefoneEntity, Long> {
}
