package br.com.security.payload.response.enseignant;

import br.com.security.utils.Status;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EnseignantResponse {
    private Integer status;
    private String message;

    public EnseignantResponse() {
    }

    public EnseignantResponse(Status status) {
        this.status = status.getCode();
        this.message = status.getMessage();
    }

    public EnseignantResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }
}
