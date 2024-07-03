package br.com.samuel.userapi.services;

import br.com.samuel.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();
}
