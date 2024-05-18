package com.batarangsolutionsspringmysql.demo.repository;

import com.batarangsolutionsspringmysql.demo.model.Investigador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;

public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
    List<Investigador> findTop10ByOrderByPosicionAsc();
}


//public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
   // Optional<Investigador> findByPosicion(Integer posicion);

  //  List<Investigador> findTop10ByPosicionDesc();


//    @Query("SELECT s FROM Investigador s WHERE s.posicion = :posicion ORDER BY s.posicion DESC")
  //  List<Investigador> buscarTop10Investigadores(@Param("posicion") Integer posicion, Pageable pageable);

//}


//public interface InvestigadorRepository extends JpaRepository<Investigador, Long> {
  //  List<Investigador> findTop10ByOrderByPosicionDesc(Pageable pageable);
//}