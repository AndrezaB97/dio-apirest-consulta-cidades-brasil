package com.githubandrezabatista.citiesapi.resources;

import com.githubandrezabatista.citiesapi.Repositories.CountryRepository;
import com.githubandrezabatista.citiesapi.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping()
    public List<Country> countries() {
        return countryRepository.findAll();
    }

}