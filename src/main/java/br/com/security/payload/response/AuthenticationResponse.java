package br.com.security.payload.response;


import br.com.security.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {
    private String token;
    private User user;
}
