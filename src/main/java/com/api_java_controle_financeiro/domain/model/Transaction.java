package com.api_java_controle_financeiro.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "tb_transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(name = "transaction_type")
    private TransactionType type;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(precision = 15, scale = 2)
    private BigDecimal amount;
    private LocalDateTime date;
    private String observation;

    public Transaction() {}

    public Transaction(User user, TransactionType type, Category category, BigDecimal amount, LocalDateTime date, String observation) {
        this.user = user;
        this.type = type;
        this.category = category;
        this.amount = amount;
        this.date = date;
        this.observation = observation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}
