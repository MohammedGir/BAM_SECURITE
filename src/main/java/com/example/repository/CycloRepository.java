package com.example.repository;


import com.example.model.Cyclo;
import com.example.model.Site;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CycloRepository extends CrudRepository<Cyclo,Long> {

    public List<Cyclo> findCycloBySite(Site site);
}
