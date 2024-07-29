package com.api_java_controle_financeiro.domain.repository;

import com.api_java_controle_financeiro.domain.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypeRepository extends JpaRepository<Type, Long> {
    boolean existsByDescription(Type description);
}
