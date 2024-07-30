package com.api_java_controle_financeiro.service;

import com.api_java_controle_financeiro.domain.model.Transaction;
import com.api_java_controle_financeiro.domain.model.TransactionType;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TransactionService {

    Transaction findById(Long id);

    Transaction create(Transaction transactionToCreate);

    void delete(Long id);

    List<Transaction> findByUserId(Long userId);

    List<Transaction> findByType(TransactionType type);
}
