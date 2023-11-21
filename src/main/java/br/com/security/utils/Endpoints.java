package br.com.security.utils;

public interface Endpoints {
    //***********************AUTHENTIFICATION*************************//
    String URL_APP = "/api/auth";
    String AUTHENTICATE = "/authenticate";
    //************************USER************************//
    String URL_USER = "/user";
    String URL_USER_ONE_USER = "/user/{id}";
    //***********************ETUDIANT*************************//
    String URL_ETUDIANT = "/etudiant";
    String URL_USER_ONE_ETUDIANT = "/etudiant/{id}";
    
    //************************ENSEIGNANT************************//
    String URL_ENSEIGNANT = "/enseignant";
    String URL_USER_ONE_ENSEIGNANT = "/enseignant/{id}";
    //*************************INSCRIPTION***********************//
    String URL_USER_INSCRIPTION = "/inscription";
    
}
