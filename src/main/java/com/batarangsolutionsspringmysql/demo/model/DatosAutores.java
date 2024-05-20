package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatosAutores {
    @JsonProperty("summary")
    private PublicacionInfo[] publicacionInfo;

    public PublicacionInfo[] getPublicacionInfo() {
        return publicacionInfo;
    }

    public void setPublicacionInfo(PublicacionInfo[] publicacionInfo) {
        this.publicacionInfo = publicacionInfo;
    }
}
