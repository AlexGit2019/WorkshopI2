package com.monifactory.api.infrastructure.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monifactory.api.infrastructure.entities.Site;
import com.monifactory.api.infrastructure.entities.SiteRepository;

@RestController
public class SiteController {
    private SiteRepository siteRepository;

    public SiteController(SiteRepository siteRepository) {
        this.siteRepository = siteRepository;
    }
    @GetMapping("/sites")
    public List<Site> getAllSites() {
        List<Site> sites = this.siteRepository.findAll();
        return sites;
    }
}
