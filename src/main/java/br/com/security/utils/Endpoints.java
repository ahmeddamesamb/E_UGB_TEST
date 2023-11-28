package br.com.security.utils;

public interface Endpoints {
    //***********************AUTHENTIFICATION*************************//
    String URL_APP = "/api/auth";
    String URL = "/api";

    String AUTHENTICATE = "/authenticate";
    //************************USER************************//
    String URL_USER = "/user";
    String URL_ONE_USER = "/user/{id}";
    //***********************ETUDIANT*************************//
    String URL_ETUDIANT = "/etudiant";
    String URL_ONE_ETUDIANT = "/etudiant/{id}";
    
    //************************ENSEIGNANT************************//
    String URL_ENSEIGNANT = "/enseignant";
    String URL_ONE_ENSEIGNANT = "/enseignant/{id}";
    //*************************INSCRIPTION***********************//
    String URL_INSCRIPTION = "/inscription";
    String URL_ONE_INSCRIPTION = "/inscription/{id}";

    //*************************CLUB ETUDIANT***********************//
    String URL_CLUB_ETUDIANT = "/clubetudiant";
    String URL_ONE_CLUB_ETUDIANT = "/clubetudiant/{id}";
    //*************************COURS***********************//
    String URL_COURS = "/cours";
    String URL_ONE_COURS = "/cours/{id}";
    //*************************DEPARTEMENT***********************//
    String URL_DEPARTEMENT = "/departement";
    String URL_ONE_DEPARTEMENT = "/departement/{id}";
    //*************************EMPLOIE DU TEMPS***********************//
    String URL_EMPLOIE_DU_TEMPS = "/emploie_du_temps";
    String URL_ONE_EMPLOIE_DU_TEMPS = "/emploie_du_temps/{id}";
    //*************************EVENEMENT***********************//
    String URL_EVENEMENT = "/evenement";
    String URL_ONE_EVENEMENT = "/evenement/{id}";
    //*************************FINANCES***********************//
    String URL_FINANCES = "/finances";
    String URL_ONE_FINANCES = "/finances/{id}";
    //*************************REMARQUE***********************//
    String URL_REMARQUE = "/remarque";
    String URL_ONE_REMARQUE = "/remarque/{id}";
    //*************************RESSOURCES HUMAINES***********************//
    String URL_RESSOURCES_HUMAINES = "/ressources_humaines";
    String URL_ONE_RESSOURCES_HUMAINES = "/ressources_humaines/{id}";
    //*************************SALLE DE CLASSE***********************//
    String URL_SALLE_DE_CLASSE= "/salle_de_classe";
    String URL_ONE_SALLE_DE_CLASSE = "/salle_de_classe/{id}";


}
