package com.xabum.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    // Usando String para salvar o texto do Enum no banco
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 50)
    private TipoCategoria tipo;

    public Usuario(String nome, TipoCategoria tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }
}