package com.example.repository;


import com.example.model.Facteur;
import com.example.model.Site;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FacteurRepository extends CrudRepository<Facteur,Long>{

    public List<Facteur> findFacteurBySite(Site site);
}
