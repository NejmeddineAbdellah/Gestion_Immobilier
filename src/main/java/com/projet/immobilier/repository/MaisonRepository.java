package com.projet.immobilier.repository;

import com.projet.immobilier.model.Maison;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaisonRepository extends JpaRepository<Maison, Long> {

Maison findById(long id);

}
