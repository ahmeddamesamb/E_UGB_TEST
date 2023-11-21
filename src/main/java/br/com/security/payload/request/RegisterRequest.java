package br.com.security.payload.request;

import br.com.security.model.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private Long id;
    private String nom;
    private String email;
    private String password;
    private String telephone;
    private ERole ERole;
    private String prenom;
    private Date naissance;

}
