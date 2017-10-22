package com.example.repository;


import com.example.model.BoiteLettre;
import com.example.model.Tournee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BoiteLettreRepository extends CrudRepository<BoiteLettre,Long>{
    public List<BoiteLettre> findBoiteLettreByTournee(Tournee tournee);
}
