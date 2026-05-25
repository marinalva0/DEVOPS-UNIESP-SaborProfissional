package com.xabum.infra.persistence.mapper;

import com.xabum.domain.Produto;
import com.xabum.infra.persistence.entity.ProdutoEntity;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

    public Produto toDomain(ProdutoEntity entity) {
        if (entity == null) return null;

        return new Produto(
                entity.getId(),
                entity.getNome(),
                entity.getPreco(), // Agora compila: BigDecimal -> BigDecimal
                entity.getCategoria()
        );
    }

    public ProdutoEntity toEntity(Produto produto) {
        if (produto == null) return null;

        ProdutoEntity entity = new ProdutoEntity();
        entity.setId(produto.getId());
        entity.setNome(produto.getNome());
        entity.setPreco(produto.getPreco()); // Agora compila: BigDecimal -> BigDecimal
        entity.setCategoria(produto.getCategoria());
        return entity;
    }
}