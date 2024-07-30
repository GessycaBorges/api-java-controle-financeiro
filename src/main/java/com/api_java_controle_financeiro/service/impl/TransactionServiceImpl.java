package com.api_java_controle_financeiro.service.impl;

import com.api_java_controle_financeiro.domain.model.Transaction;
import com.api_java_controle_financeiro.domain.model.TransactionType;
import com.api_java_controle_financeiro.domain.repository.TransactionRepository;
import com.api_java_controle_financeiro.service.TransactionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public Transaction findById(Long id) {
        return transactionRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Transaction create(Transaction transactionToCreate) {
        return transactionRepository.save(transactionToCreate);
    }

    @Override
    public void delete(Long id) {
        if (!transactionRepository.existsById(id)) {
            throw new NoSuchElementException("Transaction not found");
        }
        transactionRepository.deleteById(id);
    }

    @Override
    public List<Transaction> findByUserId(Long userId) {
        return transactionRepository.findByUserId(userId);
    }

    @Override
    public List<Transaction> findByType(TransactionType type) {
        return transactionRepository.findByType(type);
    }
}
