package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;


@Table(name = "Autores")
@Entity
public class PublicacionInfo {
    @Column(name = "autores")
    @JsonProperty
    private String autores;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public PublicacionInfo() {}

    public PublicacionInfo(DatosPublicacion datosPublicacion) {
        this.autores = datosPublicacion.autores();
    }

    @Override
    public String toString() {
        return
                "autores='" + autores + '\'' ;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }
}
