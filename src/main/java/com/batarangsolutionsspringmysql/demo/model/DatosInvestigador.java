package com.batarangsolutionsspringmysql.demo.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosInvestigador(
        @JsonAlias("position") Integer posicion,
        @JsonAlias("title") String titulo,
        @JsonAlias("publication_info") DatosPublicacion datosPublicacion,
        @JsonAlias("snippet") String resumen,
        @JsonAlias("result_id") Integer id
)
{}
