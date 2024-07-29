package com.api_java_controle_financeiro.domain.repository;

import com.api_java_controle_financeiro.domain.model.Transaction;
import com.api_java_controle_financeiro.domain.model.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByType(TransactionType type);
    List<Transaction> findByUserId(Long id);
}
