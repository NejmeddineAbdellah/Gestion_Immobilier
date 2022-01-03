package com.projet.immobilier.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Maison {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id_Maison;
    private long num_Chambre;
    private String adresse;
    private long surface;
    private String description;
    private double prix_Maison;


    public long getId_Maison(){return id_Maison;}
    public void setId_Maison(long id_Maison) {this.id_Maison = id_Maison;}
    public long getNum_Chambre() {return num_Chambre;}
    public void setNum_Chambre(long num_Chambre) {this.num_Chambre = num_Chambre;}
    public String getAdresse() {return adresse;}
    public void setAdresse(String adresse) {this.adresse = adresse;}
    public long getSurface() {return surface;}
    public void setSurface(long surface) {this.surface = surface;}
    public double getPrix_Maison() {return prix_Maison;}
    public void setPrix_Maison(double prix_Maison) {this.prix_Maison = prix_Maison;}
}
