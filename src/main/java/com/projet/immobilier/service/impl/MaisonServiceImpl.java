package com.projet.immobilier.service.impl;

import com.projet.immobilier.model.Maison;
import com.projet.immobilier.repository.MaisonRepository;
import com.projet.immobilier.service.MaisonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaisonServiceImpl implements MaisonService {

    @Autowired
    MaisonRepository maisonRepository;

    public Maison receiveMaison(Maison maison){
        return maisonRepository.save(maison);
    }


    @Override
    public Maison update(Maison maison) throws Exception {
        // check is user exists
        Maison maisonFromDB = maisonRepository.findById(maison.getId_Maison());
//        if (maisonFromDB == null) {
//            throw new MaisonNotFoundException(person.getId());
//        }
        // save user if not
        return maisonRepository.save(maison);
        // return saved user
    }

    @Override
    public Long delete(Long id_maison) throws Exception {

        Maison maisonFromDB = maisonRepository.findById(id_maison).orElse(null);
        assert maisonFromDB != null;
        maisonRepository.delete(maisonFromDB);
        return id_maison;
    }

    @Override
    public Maison save(Maison maison) throws Exception {
        // check is user exists
        Maison maisonFromDB = maisonRepository.findById(maison.getId_Maison());

        // save user if not
        return maisonRepository.save(maison);
        // return saved user
    }


}
