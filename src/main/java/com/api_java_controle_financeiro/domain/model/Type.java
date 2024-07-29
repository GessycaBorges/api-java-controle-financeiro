package com.api_java_controle_financeiro.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TransactionType description;

    public Type () {}

    public Type(TransactionType description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransactionType getDescription() {
        return description;
    }

    public void setDescription(TransactionType description) {
        this.description = description;
    }
}
