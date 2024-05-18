package com.batarangsolutionsspringmysql.demo.principal;

import com.batarangsolutionsspringmysql.demo.model.Datos;
import com.batarangsolutionsspringmysql.demo.model.DatosInvestigador;
import com.batarangsolutionsspringmysql.demo.model.Investigador;
import com.batarangsolutionsspringmysql.demo.repository.InvestigadorRepository;
import com.batarangsolutionsspringmysql.demo.service.ConsumoAPI;
import com.batarangsolutionsspringmysql.demo.service.ConvierteDatos;
import org.springframework.data.domain.PageRequest;

import java.util.*;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private final String URL_BASE = "https://serpapi.com/search?engine=google_scholar&q=ciencia&api_key=";
    private final String APIKEY_SERP = "TU-APIKEY-SERPAPI";





    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private List<DatosInvestigador> datosInvestigador = new ArrayList<>();
    private InvestigadorRepository repositorio;
    private List<Investigador> investigador;
    private Optional<Investigador> investigadorBuscado;


    public Principal(InvestigadorRepository repository) {
        this.repositorio = repository;
    }

   // private void buscarTop10Investigadores() {
    //    List<Investigador> topInvestigadores = repositorio.findTop10ByOrderByPosicionAsc();
      //  topInvestigadores.forEach(i ->
        //        System.out.println("Posición: " + i.getPosicion() + " Título:" + i.getTitulo()));
    //}

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
                    getTop10Investigadores();
                    break;
                case 2:
                  //buscarInvestigadorPosicion();
                   break;
                case 0:
                    System.out.println("Cerrando la aplicación...");
                    break;
                default:
                    System.out.println("Opcion inválida.");
            }
        }

    }

    private void getTop10Investigadores() {
        //private void getTop10Investigadores() {
            // Realiza una solicitud a la API para obtener los datos de los investigadores
            var json = consumoAPI.obtenerDatos(URL_BASE + APIKEY_SERP);
        System.out.println(json);

            // Convierte los datos JSON en un objeto Datos
            Datos datos = conversor.obtenerDatos(json, Datos.class);

            // Obtiene el array de investigadores
            Investigador[] todosLosInvestigadores = datos.getInvestigadores();

            // Ordena los investigadores por posición en orden ascendente y obtén los primeros 10
            Arrays.sort(todosLosInvestigadores, Comparator.comparing(Investigador::getPosicion));
            Investigador[] top10Investigadores = Arrays.copyOfRange(todosLosInvestigadores, 0, Math.min(10, todosLosInvestigadores.length));

            // Imprime los 10 mejores investigadores
            for (Investigador investigador : top10Investigadores) {
               // System.out.println("Posición: " + (investigador.getPosicion() + 1) +
                 //       ", Título: " + investigador.getTitulo() +
                    //    ", Autor: " + investigador.getSumario());
                System.out.println("Posición: " + (investigador.getPosicion() + 1 )+ ", Título: " + investigador.getTitulo() + ", Autor: " + investigador.getAutor());
            }
        }
        }

