package com.example.service;


import com.example.model.Site;
import com.example.model.Ville;
import com.example.repository.SiteRepository;
import com.example.repository.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Set;

@Service
public class SiteService {
    @Autowired
    private SiteRepository siteRepository;
    @Autowired
    private VilleRepository villeRepository;

    public Iterable<Site> findAllSite(){
        return siteRepository.findAll();
    }

    public Site findSiteById(String param){
        Long id = Long.parseLong(param);

        return siteRepository.findOne(id);
    }

    public List<Site> findSiteByVille(Ville ville){
        return siteRepository.findSiteByVille(ville);
    }

    public void saveSite(Site site, Long id_ville){

        Ville ville = villeRepository.findOne(id_ville);
        site.setVille(ville);
        siteRepository.save(site);




    }
}
