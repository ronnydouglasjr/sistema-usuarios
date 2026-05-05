package com.ronnysoares.sistema_usuarios.infrasctruture.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "phones")
public class TelefoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ddd", length = 3)
    private String ddd;

    @Column(name = "phone", length = 10)
    private String telefone;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity usuario;

}
