package com.api_java_controle_financeiro.config;

import com.api_java_controle_financeiro.domain.model.Category;
import com.api_java_controle_financeiro.domain.model.CategoryType;
import com.api_java_controle_financeiro.domain.repository.CategoryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializer {

    private final CategoryRepository categoryRepository;

    public DataInitializer(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @PostConstruct
    public void init() {
        if (categoryRepository.count() == 0) {
            Arrays.stream(CategoryType.values())
                    .forEach(type -> {
                        Category category = new Category();
                        category.setDescription(type);
                        categoryRepository.save(category);
                    });
        }
    }
}

