package com.githubandrezabatista.citiesapi.Repositories;

import com.githubandrezabatista.citiesapi.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
