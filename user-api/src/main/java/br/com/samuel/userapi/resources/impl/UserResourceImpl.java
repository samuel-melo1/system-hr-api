package br.com.samuel.userapi.resources.impl;

import br.com.samuel.userapi.domain.User;
import br.com.samuel.userapi.resources.UserResource;
import br.com.samuel.userapi.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/users")
public class UserResourceImpl implements UserResource {

    private final UserService service;
    @Override
    public ResponseEntity<User> findById(Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }
}
