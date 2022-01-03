package com.projet.immobilier.service.impl;

import com.projet.immobilier.model.Annonce;
import com.projet.immobilier.repository.AnnonceRepository;
import com.projet.immobilier.service.AnnonceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AnnonceServiceImpl implements AnnonceService {

    @Autowired
    AnnonceRepository annonceRepository;

    public Annonce receiveAnnonce(Annonce annonce){
        return annonceRepository.save(annonce);
    }

}
