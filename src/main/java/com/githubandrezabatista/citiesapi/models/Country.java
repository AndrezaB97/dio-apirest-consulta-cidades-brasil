package com.githubandrezabatista.citiesapi.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pais")
@Data
public class Country {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;

    @Column(name = "nome_pt")
    private String ptName;

    @Column(name = "sigla")
    private String code;

    @Column(name = "bacen")
    private String bacen;
}