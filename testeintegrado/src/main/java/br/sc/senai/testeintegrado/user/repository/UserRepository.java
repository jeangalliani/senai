package br.sc.senai.testeintegrado.user.repository;


import br.sc.senai.testeintegrado.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}