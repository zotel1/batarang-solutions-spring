package com.batarangsolutionsspringmysql.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import com.batarangsolutionsspringmysql.demo.model.PublicacionInfo;

import java.util.List;

//@Entity
//@Table(name = "Investigadores")
//@JsonIgnoreProperties(ignoreUnknown = true)
//public class Investigador {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long Id;
    //@Column(name = "posicion")
    //@JsonProperty("position")
    //private Integer posicion;
    //@Column(name = "titulo")
    //@JsonProperty("title")
    //private String titulo;
   // @Column(name = "autor")
    //@JsonProperty("publication_info.summary")
    //private String autor;
    //@Column(name = "resumen")
    //@JsonProperty("snippet")
    //private String resumen;

    //@Column(name = "resultId")
    //@JsonProperty("result_id")
    //private String resultId;
    //@OneToOne
    //@JoinColumn(name = "publicacion_info_id")
   // private PublicacionInfo publicacionInfo;


    @Entity
    @Table(name = "Investigadores")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class Investigador {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long Id;
        @Column(name = "posicion")
        @JsonProperty("position")
        private Integer posicion;
        @Column(name = "titulo")
        @JsonProperty("title")
        private String titulo;
        @Column(name = "resumen")
        @JsonProperty("snippet")
        private String resumen;

        @Column(name = "resultId")
        @JsonProperty("result_id")
        private String resultId;
        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "publicacion_info_id", referencedColumnName = "id")
        private PublicacionInfo publicacionInfo;



        public Investigador() {}

        public Investigador(DatosInvestigador datosInvestigador) {
            this.posicion = datosInvestigador.posicion();
            this.titulo = datosInvestigador.titulo();
            this.resumen = datosInvestigador.resumen();
            this.publicacionInfo = new PublicacionInfo();
            this.publicacionInfo.setSummary(datosInvestigador.datosPublicacion().getSummary());
        }


    @Override
    public String toString() {
        return "Investigador" +
                "posicion=" + posicion +
                ", titulo='" + titulo + '\'' +
                ", resumen='" + resumen + '\'' ;
    }

    public PublicacionInfo getPublicacionInfo() {
        return publicacionInfo;
    }

    public void setPublicacionInfo(PublicacionInfo publicacionInfo) {
        this.publicacionInfo = publicacionInfo;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Integer getPosicion() {
        return posicion;
    }

    public void setPosicion(Integer posicion) {
        this.posicion = posicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return publicacionInfo.getSummary();
    }

    public void setAutor(String autor) {
        publicacionInfo.setSummary(autor);
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    // public String getNombre(List<DatosInvestigador> investigadores) {
      //  return nombre;
    //}

   // public void setNombre(String nombre) {
      //  this.nombre = nombre;
    //}
}
