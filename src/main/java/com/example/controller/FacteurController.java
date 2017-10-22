package com.example.controller;



import com.example.model.Facteur;
import com.example.model.Site;
import com.example.model.Ville;
import com.example.service.FacteurService;
import com.example.service.SiteService;
import com.example.service.VilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("/facteur")
@Controller
public class FacteurController {
    @Autowired
    private SiteService siteService;
    @Autowired
    private FacteurService facteurService;
    @Autowired
    private VilleService villeService;

    @RequestMapping("/all")
    public String facteurs(Model model) {
       Iterable<Site> sites = siteService.findAllSite();
       Iterable<Facteur> facteurs = facteurService.findAllFacteur();
       Iterable<Ville> villes = villeService.findAllVille();
       model.addAttribute("facteurs",facteurs);
       model.addAttribute("sites",sites);
       model.addAttribute("villes",villes);

        return "facteur";
    }

    @RequestMapping( value = "/bySite/{id}",method = RequestMethod.GET)
    public @ResponseBody
    List<Facteur> facteurBySite(@PathVariable("id") String id){
        Site site= siteService.findSiteById(id);
        List<Facteur> facteurs = facteurService.findFacteurBySite(site);
        return facteurs;
    }
}
