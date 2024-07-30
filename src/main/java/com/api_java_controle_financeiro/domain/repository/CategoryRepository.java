package com.api_java_controle_financeiro.domain.repository;

import com.api_java_controle_financeiro.domain.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
