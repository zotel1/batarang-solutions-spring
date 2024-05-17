package com.batarangsolutionsspringmysql.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Investigadores")
public class Investigador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(unique = true)
    private Integer posicion;
    private String titulo;
    private String sumario;
    private String resumen;
    private String nombre;

    public Investigador() {}

    public Investigador(DatosInvestigador datosInvestigador) {
        this.posicion = datosInvestigador.posicion();
        this.titulo = datosInvestigador.titulo();
        this.sumario = datosInvestigador.sumario();
        this.resumen = datosInvestigador.resumen();
        this.nombre = datosInvestigador.nombre();
    }

    @Override
    public String toString() {
        return "Investigador" +
                "posicion=" + posicion +
                ", titulo='" + titulo + '\'' +
                ", sumario='" + sumario + '\'' +
                ", resumen='" + resumen + '\'' +
                ", nombre='" + nombre + '\'';
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

    public String getSumario() {
        return sumario;
    }

    public void setSumario(String sumario) {
        this.sumario = sumario;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
