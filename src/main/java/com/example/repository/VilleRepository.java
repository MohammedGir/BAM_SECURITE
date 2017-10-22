package com.example.repository;


import com.example.model.Region;
import com.example.model.Ville;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VilleRepository extends CrudRepository<Ville,Long>{
    public List<Ville> findVilleByRegion(Region region);
    public Ville findVilleByNom(String nom);
}
