package br.com.samuel.userapi;

import br.com.samuel.userapi.domain.User;
import br.com.samuel.userapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UserApiApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(UserApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.saveAll(List.of(
				new User(null, "Valdir", "valdir@gmail.com", "123", 30.0)
		));
	}
}
