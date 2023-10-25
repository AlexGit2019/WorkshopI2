package com.monifactory.api.infrastructure.entities;

import java.util.List;
import org.springframework.data.repository.Repository;

public interface SiteRepository extends Repository<Site,Integer> {
    List<Site> findAll();
}
