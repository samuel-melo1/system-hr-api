package br.com.samuel.userapi.services.impl;

import br.com.samuel.userapi.domain.User;
import br.com.samuel.userapi.repositories.UserRepository;
import br.com.samuel.userapi.services.UserService;
import br.com.samuel.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final Environment env;
    @Override
    public User findById(Long id) {
        log.info("USER_SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object Not Found!"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}
