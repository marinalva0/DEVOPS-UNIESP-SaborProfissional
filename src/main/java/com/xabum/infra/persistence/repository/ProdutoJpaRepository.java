package com.xabum.infra.persistence.repository;

import com.xabum.infra.persistence.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoJpaRepository extends JpaRepository<ProdutoEntity, Long> {
}
