package com.api_java_controle_financeiro.service;

import com.api_java_controle_financeiro.domain.model.User;
import com.api_java_controle_financeiro.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDTO findById(Long id);

    User create(User userToCreate);
}
