package com.example.repository;


import com.example.model.Site;
import com.example.model.Ville;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SiteRepository extends CrudRepository<Site,Long> {

    public List<Site> findSiteByVille(Ville ville);
    public Site findSiteByNom(String nom);

}
