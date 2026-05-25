package com.xabum.application.service;

import com.xabum.domain.Usuario;
import com.xabum.infra.persistence.entity.UsuarioEntity;
import com.xabum.infra.persistence.mapper.UsuarioMapper;
import com.xabum.infra.persistence.repository.UsuarioJpaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioJpaRepository usuarioJpaRepository;
    private final UsuarioMapper usuarioMapper;

    public List<Usuario> listarTodos() {
        return usuarioJpaRepository.findAll()
                .stream()
                .map(usuarioMapper::toDomain)
                .toList();
    }

    public Usuario salvar(Usuario usuario) {
        UsuarioEntity entity = usuarioMapper.toEntity(usuario);
        UsuarioEntity savedEntity = usuarioJpaRepository.save(entity);
        return usuarioMapper.toDomain(savedEntity);
    }

    public Usuario atualizar(Long id, Usuario usuarioAtualizado) {
        //Passos para futuras explications "buscamos a Entity direto da infraestrutura" e leiam tbm um pouco , n virem analfabetos
        UsuarioEntity entity = usuarioJpaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario com ID " + id + " nao encontrado."));

        //Passos para futura explications aqui atualiza os dados da Entity com as informações vindas do Domain viu moçoilas e moçoilos??
        entity.setNome(usuarioAtualizado.getNome());
        entity.setTipo(usuarioAtualizado.getTipo());

        UsuarioEntity savedEntity = usuarioJpaRepository.save(entity);
        return usuarioMapper.toDomain(savedEntity);
    }

    public void deletar(Long id) {
        usuarioJpaRepository.deleteById(id);
    }
}