package com.api_java_controle_financeiro.domain.model;

public enum TransactionType {
    ENTRADA("Entrada"),
    SAIDA("Saída");

    private final String description;

    TransactionType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
