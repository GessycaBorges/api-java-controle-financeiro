package com.api_java_controle_financeiro.service.impl;

import com.api_java_controle_financeiro.domain.model.Category;
import com.api_java_controle_financeiro.domain.repository.CategoryRepository;
import com.api_java_controle_financeiro.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}