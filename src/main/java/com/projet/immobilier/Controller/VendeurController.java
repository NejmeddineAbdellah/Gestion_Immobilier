package com.projet.immobilier.Controller;

import com.projet.immobilier.model.Vendeur;
import com.projet.immobilier.service.VendeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("vendeur")
public class VendeurController {

    @Autowired
    VendeurService vendeurService;

    @PostMapping("/")
    public Vendeur receiveVendeur(@RequestBody Vendeur vendeur){

        return vendeurService.receiveVendeur(vendeur);
    }
}
