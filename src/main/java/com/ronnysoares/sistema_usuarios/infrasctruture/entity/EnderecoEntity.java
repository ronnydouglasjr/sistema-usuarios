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
@Table(name = "addresses")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "street", length = 255, nullable = false)
    private String rua;

    @Column(name = "number", nullable = false, length = 10)
    private String numero;

    @Column(name = "complement", length = 255)
    private String complemento;

    @Column(name = "city", length = 100, nullable = false)
    private String cidade;

    @Column(name = "state", length = 2, nullable = false)
    private String estado;

    @Column(name = "cep", length = 9, nullable = false)
    private String cep;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UsuarioEntity usuario;
}
