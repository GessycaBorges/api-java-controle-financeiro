package com.api_java_controle_financeiro.service.impl;

import com.api_java_controle_financeiro.domain.model.User;
import com.api_java_controle_financeiro.domain.repository.UserRepository;
import com.api_java_controle_financeiro.service.UserService;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User Create(User userToCreate) {
        if (userToCreate.getUserId() != null && userRepository.existsById(userToCreate.getUserId())) {
            throw new DuplicateKeyException("Username already exists");
        }
        return userRepository.save(userToCreate);
    }
}
