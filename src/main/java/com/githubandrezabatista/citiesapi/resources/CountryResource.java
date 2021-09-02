package com.githubandrezabatista.citiesapi.resources;

import com.githubandrezabatista.citiesapi.Repositories.CountryRepository;
import com.githubandrezabatista.citiesapi.models.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    CountryRepository countryRepository;

    @GetMapping
    public Page<Country> countries(Pageable page) {
        return countryRepository.findAll(page);
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id) {
        Optional<Country> optional = countryRepository.findById(id);
        return optional.get();
    }

}