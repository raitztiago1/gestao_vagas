package com.raitztiago.gestao_vagas.modules.candidate.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CandidateEntity {
    
    private UUID id;
    private String name;
    private String username;
    private String email;
    private String password;
    private String description;
    private String curriculum;

}
