package com.example.repository;


import com.example.model.Site;
import com.example.model.Tournee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TourneeRepository  extends CrudRepository<Tournee,Long>{
    public List<Tournee> findTourneeBySite(Site site);
    public Tournee findTourneeByNumero(Long numero);
}
