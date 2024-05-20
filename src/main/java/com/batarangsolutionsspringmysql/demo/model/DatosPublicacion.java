package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosPublicacion<publicacion>(
        @JsonAlias("summary") String autores
) {
}
