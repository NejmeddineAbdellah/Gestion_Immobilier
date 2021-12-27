package com.projet.immeuble.model;

public class Vendeur {
    protected long id_Client;
    private String cin_Client;
    private String nom_Client;
    private String prenom_Client;
    private String adresse_Client;
    private String Tele;
    private String email;
    private String username;
    private String password;

    public long getId_Client() {
        return id_Client;
    }

    public void setId_Client(long id_Client) {
        this.id_Client = id_Client;
    }

    public String getCin_Client() {
        return cin_Client;
    }

    public void setCin_Client(String cin_Client) {
        this.cin_Client = cin_Client;
    }

    public String getNom_Client() {
        return nom_Client;
    }

    public void setNom_Client(String nom_Client) {
        this.nom_Client = nom_Client;
    }

    public String getPrenom_Client() {
        return prenom_Client;
    }

    public void setPrenom_Client(String prenom_Client) {
        this.prenom_Client = prenom_Client;
    }

    public String getAdresse_Client() {
        return adresse_Client;
    }

    public void setAdresse_Client(String adresse_Client) {
        this.adresse_Client = adresse_Client;
    }

    public String getTele() {
        return Tele;
    }

    public void setTele(String tele) {
        Tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
