package com.batarangsolutionsspringmysql.demo.repository;

import com.batarangsolutionsspringmysql.demo.model.Investigador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
    //Optional<Investigador> findByPosicionContainsIgnoreCase(String nombreInvestigadorr);

    List<Investigador> findTop10ByEvaluacionDesc();
    @Query("SELECT p FROM Investigador s JOIN s.posicion p WHERE s = :investigador ORDER BY e.posicion DESC LIMIT 5 ")
    List<Investigador>  top5Episodios(Investigador investigador);

}

