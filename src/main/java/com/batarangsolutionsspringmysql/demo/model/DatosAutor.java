package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutor<publicacion>(
       @JsonAlias("position") Integer posicion,
       @JsonAlias("title") String titulo,
       @JsonAlias("summary") String sumario,
       @JsonAlias("snippet") String resumen,
       @JsonAlias("name") String nombre

) {
}
