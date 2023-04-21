package br.sc.senai.testeintegrado.user.api;

import br.sc.senai.testeintegrado.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.sc.senai.testeintegrado.user.domain.User;

@RestController
@RequestMapping("users")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository repository;

    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable String id) {

        var user = repository.findById(id).orElseThrow(() -> new RuntimeException("O usuário com o id: " + id + ", não existe."));

        if(user.getName().equals("Jean"))
            user.setName("Pedro");

        return ResponseEntity.ok(user);
    }
}