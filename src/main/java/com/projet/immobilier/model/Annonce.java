package com.projet.immobilier.model;

public class Annonce {
    private long id_Annance;
    private long id_Maison;
    private long cin_Vendeur;
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

    public String getDescription_Annance() {
        return description_Annance;
    }

    public void setDescription_Annance(String description_Annance) {
        this.description_Annance = description_Annance;
    }

    public long getCin_Vendeur() {return cin_Vendeur;}

    public void setCin_Vendeur(long cin_Vendeur) {this.cin_Vendeur = cin_Vendeur;}
}
