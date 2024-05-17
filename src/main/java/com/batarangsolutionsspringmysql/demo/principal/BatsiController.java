package com.batarangsolutionsspringmysql.demo.principal;

import com.batarangsolutionsspringmysql.demo.model.DatosInvestigador;
import com.batarangsolutionsspringmysql.demo.model.Investigador;
import com.batarangsolutionsspringmysql.demo.repository.InvestigadorRepository;
import com.batarangsolutionsspringmysql.demo.service.ConsumoAPI;
import com.batarangsolutionsspringmysql.demo.service.ConvierteDatos;
import com.batarangsolutionsspringmysql.demo.repository.InvestigadorRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class BatsiController {
    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://serpapi.com/search?engine=google_scholar&q=ciencia&api_key=";
    private final String APIKEY_SERP = "TU-APIKEY-SERPAPI";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosInvestigador> datosInvestigador = new ArrayList<>();
    private InvestigadorRepository repositorio;
    private List<Investigador> investigador;
    private Optional<Investigador> investigadorBuscado;

    public BatsiController(InvestigadorRepository repository) {
        this.repositorio = repository;
    }

    public void muestraElMenu() {
        var opcion = -1;
        while (opcion != 0) {
            var menu = """
                    ********************************************
                    1 - Top 10 investigadores estrellas
                    
                    2 - Buscar investigador por posición
                    
                    0 - Salir
                    
                    ********************************************
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    buscarTop10Investigadores();
                    break;
              //  case 2:
                //    buscarInvestigadorPosicion();
                  //  break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
            }
        }
    }

    private void buscarTop10Investigadores() {
        List<Investigador> topInvestigadores = repositorio.findTop10ByEvaluacionDesc();
        topInvestigadores.forEach(i ->
                System.out.println("Posición: " + i.getPosicion() + "Titulo:" + i.getTitulo()));
    }
}
