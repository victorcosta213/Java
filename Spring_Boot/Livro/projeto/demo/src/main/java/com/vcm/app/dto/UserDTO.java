package com.vcm.app.dto;


import com.vcm.app.model.User;
import jakarta.validation.constraints.NotBlank;
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

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Email é obrigatório")
    private String email;
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;
    private String telefone;
    private String endereco;
    private LocalDateTime dataCadastro;


    public static UserDTO convert (User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setNome(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setCpf(user.getCpf());
        userDTO.setTelefone(user.getTelefone());
        userDTO.setEndereco(user.getEndereco());
        userDTO.setDataCadastro(user.getDataCadastro());
        return userDTO;
    }

}
