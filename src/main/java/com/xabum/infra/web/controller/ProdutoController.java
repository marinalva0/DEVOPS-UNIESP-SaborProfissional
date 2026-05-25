package com.xabum.infra.web.controller;

import com.xabum.application.service.ProdutoService;
import com.xabum.domain.Produto;
import java.util.List;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor // construtor automatico e lindo dms
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    public List<Produto> listar() {
        return produtoService.listarTodos();
    }

    @PostMapping
    public Produto criar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.atualizar(id, produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        produtoService.deletar(id);
    }
}