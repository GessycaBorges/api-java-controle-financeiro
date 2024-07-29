package com.api_java_controle_financeiro.domain.model;

public enum CategoryType {

    ALIMENTACAO("Alimentação"),
    ASSINATURAS_E_SERVICOS("Assinaturas e Serviços"),
    CASA("Casa"),
    MERCADO("Mercado"),
    CUIDADOS_PESSOAIS("Cuidados Pessoais"),
    EDUCACAO("Educação"),
    FAMILIA("Família"),
    LAZER("Lazer"),
    PETS("Pets"),
    PRESENTES("Presentes"),
    ROUPAS("Roupas"),
    SAUDE("Saúde"),
    TRANSPORTE("Transporte"),
    SALARIO("Salário"),
    VENDAS("Vendas"),
    OUTRAS_RECEITAS("Outras receitas"),
    OUTRAS_DESPESAS("Outras despesas");

    private final String description;

    CategoryType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

}
