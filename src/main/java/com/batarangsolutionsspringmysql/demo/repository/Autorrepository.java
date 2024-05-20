package com.batarangsolutionsspringmysql.demo.repository;

import com.batarangsolutionsspringmysql.demo.model.PublicacionInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Autorrepository extends JpaRepository<PublicacionInfo, Long> {
    List<PublicacionInfo>  topAutores = findTop10ByOrderByPosicionAsc();

    static List<PublicacionInfo> findTop10ByOrderByPosicionAsc() {
        return List.of();
    }

}
