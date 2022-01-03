package com.projet.immobilier.service;

import com.projet.immobilier.model.Maison;

public interface MaisonService {

    public Maison receiveMaison(Maison maison);
    
    Maison save(Maison maison) throws Exception;

    Maison update(Maison maison) throws Exception;

    Long delete(Long id_maison) throws Exception;

}
