package com.projet.immeuble.model;

public class Annance {
    protected long id_Annance;
    protected long id_Maison;
    protected long id_Client;
    private String description_Annance;

    public long getId_Annance() {
        return id_Annance;
    }

    public void setId_Annance(long id_Annance) {
        this.id_Annance = id_Annance;
    }

    public long getId_Maison() {
        return id_Maison;
    }

    public void setId_Maison(long id_Maison) {
        this.id_Maison = id_Maison;
    }

    public long getId_Client() {
        return id_Client;
    }

    public void setId_Client(long id_Client) {
        this.id_Client = id_Client;
    }

    public String getDescription_Annance() {
        return description_Annance;
    }

    public void setDescription_Annance(String description_Annance) {
        this.description_Annance = description_Annance;
    }
}
