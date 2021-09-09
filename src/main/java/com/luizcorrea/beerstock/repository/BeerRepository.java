package com.luizcorrea.beerstock.repository;

import com.luizcorrea.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
// responsável para conversar com o banco de dados

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String name);
}
