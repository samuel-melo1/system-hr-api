package br.com.samuel.userapi.repositories;

import br.com.samuel.userapi.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
