package com.xabum.infra.persistence.mapper;

import com.xabum.domain.Usuario;
import com.xabum.infra.persistence.entity.UsuarioEntity;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toDomain(UsuarioEntity entity) {
        return new Usuario(
                entity.getId(),
                entity.getNome(),
                entity.getTipo()
        );
    }

    public UsuarioEntity toEntity(Usuario usuario) {
        UsuarioEntity entity = new UsuarioEntity();
        entity.setId(usuario.getId());
        entity.setNome(usuario.getNome());
        entity.setTipo(usuario.getTipo());
        return entity;
    }
}
