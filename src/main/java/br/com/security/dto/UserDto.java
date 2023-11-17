package br.com.security.dto;

import br.com.security.model.Role;
import lombok.Data;

import java.util.Date;

@Data
public class UserDto {
    private Long id;
    private String password;
    private String nom;
    private String email;
    private String telephone;
    private Role role;
}
