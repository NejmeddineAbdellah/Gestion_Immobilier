package com.projet.immobilier.dto;

public class MaisonDTO {


    private long id_Maison;
    private long num_Chambre;
    private String adresse;
    private long surface;
    private String description;
    private double prix_Maison;


    public long getId_Maison() {
        return id_Maison;
    }
    public void setId_Maison(long id_Maison) {
        this.id_Maison = id_Maison;
    }
    public long getNum_Chambre() {
        return num_Chambre;
    }
    public void setNum_Chambre(long num_Chambre) {
        this.num_Chambre = num_Chambre;
    }
    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public long getSurface() {
        return surface;
    }
    public void setSurface(long surface) {
        this.surface = surface;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrix_Maison() {
        return prix_Maison;
    }
    public void setPrix_Maison(double prix_Maison) {
        this.prix_Maison = prix_Maison;
    }
    public MaisonDTO(long id_maison, long num_chambre, String adresse, long surface, String description, double prix_maison) {
        id_Maison = id_maison;
        num_Chambre = num_chambre;
        this.adresse = adresse;
        this.surface = surface;
        this.description = description;
        prix_Maison = prix_maison;
    }
}
