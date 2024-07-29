package com.api_java_controle_financeiro.domain.model;

import jakarta.persistence.*;

@Entity(name = "tb_catedory")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private CategoryType description;

    public Category() {}

    public Category(CategoryType description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CategoryType getDescription() {
        return description;
    }

    public void setDescription(CategoryType description) {
        this.description = description;
    }
}
