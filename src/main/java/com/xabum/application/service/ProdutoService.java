package com.xabum.application.service;

import com.xabum.domain.Produto;
import com.xabum.infra.persistence.entity.ProdutoEntity;
import com.xabum.infra.persistence.mapper.ProdutoMapper;
import com.xabum.infra.persistence.repository.ProdutoJpaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoJpaRepository produtoJpaRepository;
    private final ProdutoMapper produtoMapper;

    public List<Produto> listarTodos() {
        return produtoJpaRepository.findAll()
                .stream()
                .map(produtoMapper::toDomain)
                .toList();
    }

    public Produto salvar(Produto produto) {
        ProdutoEntity entity = produtoMapper.toEntity(produto);
        ProdutoEntity savedEntity = produtoJpaRepository.save(entity);
        return produtoMapper.toDomain(savedEntity);
    }

    public Produto atualizar(Long id, Produto produtoAtualizado) {
        ProdutoEntity entity = produtoJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto com ID " + id + " nao encontrado."));

        entity.setNome(produtoAtualizado.getNome());
        entity.setPreco(produtoAtualizado.getPreco());
        entity.setCategoria(produtoAtualizado.getCategoria());

        ProdutoEntity savedEntity = produtoJpaRepository.save(entity);
        return produtoMapper.toDomain(savedEntity);
    }

    public void deletar(Long id) {
        produtoJpaRepository.deleteById(id);
    }
}