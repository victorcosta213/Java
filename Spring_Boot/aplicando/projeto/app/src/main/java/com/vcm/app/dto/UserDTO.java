package com.vcm.app.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {

    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;

}
