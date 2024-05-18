package com.batarangsolutionsspringmysql.demo.model;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosInvestigador<publicacion>(
       @JsonAlias("position") Integer posicion,
       @JsonAlias("title") String titulo,
       @JsonAlias("publication_info") String publi,
       @JsonAlias("summary") String autor,
       @JsonAlias("snippet") String resumen,
       @JsonAlias("result_id") Integer id

)
{}
