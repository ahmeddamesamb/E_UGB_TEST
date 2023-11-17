package br.com.security.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Messages {

    TYPE_ACTION_CREATION("Création de demande"),
    TYPE_ACTION_CREATION_ET_VALIDER("Création et validation de demande"),
    TYPE_ACTION_VALIDER("Validation de la demande"),
    TYPE_ACTION_INVALIDER("Invalidation de la demande");
    
    private final String value;

}
