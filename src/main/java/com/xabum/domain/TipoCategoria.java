package com.xabum.domain;

import java.util.Arrays;

public enum TipoCategoria {
    VENDEDOR(1),
    CLIENTE(2),
    ELETRONICOS(3),
    PERIFERICOS(4),
    OUTROS(5);

    private final int codigo;

    TipoCategoria(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public static TipoCategoria fromCodigo(int codigo) {
        return Arrays.stream(values())
                .filter(categoria -> categoria.codigo == codigo)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Codigo invalido: " + codigo));
    }
}
