package com.xabum.infra.persistence.repository;

import com.xabum.infra.persistence.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<UsuarioEntity, Long> {
}
