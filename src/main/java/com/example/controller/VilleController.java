package com.example.controller;


import com.example.model.Region;
import com.example.model.Ville;
import com.example.service.RegionService;
import com.example.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/ville")
@Controller
public class VilleController {
  @Autowired
    private RegionService regionService;
  @Autowired
  private VilleService villeService;
  @RequestMapping(value = "/{id}", method= RequestMethod.GET)
    public @ResponseBody List<Ville> region(@PathVariable() Long id) {

        Region region = regionService.findRegionById(id);
        List<Ville> villes = villeService.findVilleByRegion(region);

        return villes;
    }
    @RequestMapping("/form")
    public String form(Model model){
      Iterable<Region> regions = regionService.findAllRegion();
      Iterable<Ville> villes = villeService.findAllVille();
      model.addAttribute("regions",regions);
      model.addAttribute("villes",villes);
      return "test";
    }
}
