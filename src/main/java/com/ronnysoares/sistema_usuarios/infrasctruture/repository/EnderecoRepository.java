package com.ronnysoares.sistema_usuarios.infrasctruture.repository;


import com.ronnysoares.sistema_usuarios.infrasctruture.entity.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
