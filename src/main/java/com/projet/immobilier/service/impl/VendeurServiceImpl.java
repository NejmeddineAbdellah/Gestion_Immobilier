package com.projet.immobilier.service.impl;

import com.projet.immobilier.model.Vendeur;
import com.projet.immobilier.repository.VendeurRepository;
import com.projet.immobilier.service.VendeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendeurServiceImpl implements VendeurService {

    @Autowired
    VendeurRepository vendeurRepository;

    public Vendeur receiveVendeur(Vendeur vendeur){
        return vendeurRepository.save(vendeur);
    }


}
