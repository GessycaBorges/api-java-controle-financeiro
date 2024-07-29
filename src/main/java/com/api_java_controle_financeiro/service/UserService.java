package com.api_java_controle_financeiro.service;

import com.api_java_controle_financeiro.domain.model.User;

public interface UserService {

    User findById(Long id);

    User Create(User userToCreate);
}
