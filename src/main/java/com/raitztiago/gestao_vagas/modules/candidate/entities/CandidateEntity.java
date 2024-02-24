package com.raitztiago.gestao_vagas.modules.candidate.entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEntity {

    private UUID id;
    private String name;
    @NotBlank(message = "O campo [Username] não pode estar vazio")
    @Pattern(regexp = "\\S+", message = "O campo [Username] não deve conter espaço.")
    private String username;
    @Email(message = "O campo [E-mail] deve conter um E-mail válido!")
    private String email;
    @Length(min = 10, max = 100, message = "O campo [Senha] deve conter entre 10 e 100 caracteres!")
    private String password;
    private String description;
    private String curriculum;

}
