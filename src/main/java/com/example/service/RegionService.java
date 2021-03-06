package com.example.service;


import com.example.model.Region;
import com.example.repository.RegionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    @Autowired
    private RegionRepository regionRepository;

    public Iterable<Region> findAllRegion(){
        return regionRepository.findAll();
    }

    public Region findRegionById(Long region_id){
       return regionRepository.findOne(region_id);
    }

}
