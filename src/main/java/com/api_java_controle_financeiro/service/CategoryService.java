package com.api_java_controle_financeiro.service;

import com.api_java_controle_financeiro.domain.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAll();

    Category findById(Long id);
}