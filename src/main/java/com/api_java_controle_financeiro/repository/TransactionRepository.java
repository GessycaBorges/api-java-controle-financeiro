package com.api_java_controle_financeiro.repository;

import com.api_java_controle_financeiro.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUserId(Long userId);
    List<Transaction> findByCategoryId(Long categoryId);
    List<Transaction> findByTypeId(Long typeId);
}
