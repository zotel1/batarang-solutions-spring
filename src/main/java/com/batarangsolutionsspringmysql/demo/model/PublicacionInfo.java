package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

//@Entity
//@Table(name = "PublicacionInfo")
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class PublicacionInfo {
   // @jakarta.persistence.Id
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
   // private Long Id;
   // @Column(name = "summary")
  //  @JsonProperty("summary")
//    private String summary;

    @Entity
    @Table(name = "PublicacionInfo")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class PublicacionInfo {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(name = "summary")
        @JsonProperty("summary")
        private String summary;




        public PublicacionInfo() {}

    public PublicacionInfo(DatosPublicacion datosPublicacion) {
        this.summary = datosPublicacion.getSummary();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "PublicacionInfo{" +
                "Id=" + id +
                ", summary='" + summary + '\'' +
                '}';
    }
}