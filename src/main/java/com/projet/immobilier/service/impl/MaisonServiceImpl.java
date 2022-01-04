package com.projet.immobilier.service.impl;

import com.projet.immobilier.model.Maison;
import com.projet.immobilier.repository.MaisonRepository;
import com.projet.immobilier.service.MaisonService;
import org.springframework.stereotype.Service;

@Service
public class MaisonServiceImpl implements MaisonService {

    final
    MaisonRepository maisonRepository;

    public MaisonServiceImpl(MaisonRepository maisonRepository) {
        this.maisonRepository = maisonRepository;
    }

    public Maison receiveMaison(Maison maison){
        return maisonRepository.save(maison);
    }


    @Override
    public Maison update(Maison maison) {
        // check is user exists
        Maison maisonFromDB = maisonRepository.findById(maison.getId_Maison());
//        if (maisonFromDB == null) {
//            throw new MaisonNotFoundException(person.getId());
//        }
        // save user if not
        return maisonRepository.save(maisonFromDB);
        // return saved user
    }

    @Override
    public Long delete(Long id_maison) {

        Maison maisonFromDB = maisonRepository.findById(id_maison).orElse(null);
        assert maisonFromDB != null;
        maisonRepository.delete(maisonFromDB);
        return id_maison;
    }

    @Override
    public Maison save(Maison maison) {
        // check is user exists
        Maison maisonFromDB = maisonRepository.findById(maison.getId_Maison());

        // save user if not
        return maisonRepository.save(maisonFromDB);
        // return saved user
    }


}
