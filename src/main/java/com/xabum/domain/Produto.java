package com.xabum.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {

    private Long id;
    private String nome;
    private BigDecimal preco;
    private TipoCategoria categoria;


    public Produto(String nome, BigDecimal preco, TipoCategoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }
}