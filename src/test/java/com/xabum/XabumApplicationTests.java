package com.xabum;

import static org.assertj.core.api.Assertions.assertThat;

import com.xabum.infra.web.controller.ProdutoController;
import com.xabum.infra.web.controller.UsuarioController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XabumApplicationTests {

    @Autowired
    private ProdutoController produtoController;

    @Autowired
    private UsuarioController usuarioController;

    @Test
    void contextLoads() {
        // Esse teste garante que o Spring Boot conseguiu subir todo o ecossistema do projeto
        // e que a fiação interna (injeção de dependências do Service, Repository e Mapper) está perfeita!
        assertThat(produtoController).isNotNull();
        assertThat(usuarioController).isNotNull();
    }
}