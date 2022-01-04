package com.projet.immobilier.Controller;

import com.projet.immobilier.model.Annonce;
import com.projet.immobilier.model.Vendeur;
import com.projet.immobilier.service.AnnonceService;
import com.projet.immobilier.service.VendeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("annonce")
public class AnnanceController {

    @Autowired
    AnnonceService annonceService;

    @PostMapping("/")
    public Annonce receiveAnnonce(@RequestBody Annonce annonce){

        return annonceService.receiveAnnonce(annonce);
    }
}
