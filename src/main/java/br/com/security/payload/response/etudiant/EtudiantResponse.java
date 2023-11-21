package br.com.security.payload.response.etudiant;

import br.com.security.model.Etudiant;
import br.com.security.model.User;
import br.com.security.utils.Status;
import lombok.*;

@Getter
@Setter
@ToString
public class EtudiantResponse {
    private Integer status;
    private String message;
    public EtudiantResponse() {
    }

    public EtudiantResponse(Status status) {
        this.status = status.getCode();
        this.message = status.getMessage();
    }

    public EtudiantResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
