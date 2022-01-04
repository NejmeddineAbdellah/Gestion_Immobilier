package com.projet.immobilier.Controller;

import com.projet.immobilier.model.Maison;
import com.projet.immobilier.service.MaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("maison")
public class MaisonController {

    @Autowired
    MaisonService maisonService;

    @PostMapping("/")
    public Maison receiveMaison(@RequestBody Maison maison){

        return maisonService.receiveMaison(maison);
    }
}
