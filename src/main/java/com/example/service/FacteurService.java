package com.example.service;


import com.example.model.Facteur;
import com.example.model.Site;
import com.example.repository.FacteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacteurService {
    @Autowired
    private FacteurRepository facteurRepository;

    public Iterable<Facteur> findAllFacteur(){
        return facteurRepository.findAll();
    }

    public List<Facteur> findFacteurBySite(Site site){
        return facteurRepository.findFacteurBySite(site);
    }
}
