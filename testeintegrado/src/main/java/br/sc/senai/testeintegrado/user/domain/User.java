package br.sc.senai.testeintegrado.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    private String id;

    private String name;

    public boolean isNomeMaiorQueTres() {
        return name.length() > 3;
    }

}
