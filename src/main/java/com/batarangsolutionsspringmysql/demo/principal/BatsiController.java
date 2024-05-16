package com.batarangsolutionsspringmysql.demo.principal;

import com.batarangsolutionsspringmysql.demo.model.DatosAutor;
import com.batarangsolutionsspringmysql.demo.service.ConsumoAPI;
import com.batarangsolutionsspringmysql.demo.service.ConvierteDatos;

import java.util.Scanner;

public class BatsiController {
    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://serpapi.com/search?engine=google_scholar&q=ciencia&api_key=";
    private final String APIKEY_SERP = "TU-APIKEY-SERPAPI";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraElMenu() {
        System.out.println("Escribe la posicion que desees buscar");
        var numeroAutor = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + numeroAutor);
        DatosAutor datos = conversor.obtenerDatos(json, DatosAutor.class);
        System.out.println(datos);

        // Obtener top 5 autores
    }

}
