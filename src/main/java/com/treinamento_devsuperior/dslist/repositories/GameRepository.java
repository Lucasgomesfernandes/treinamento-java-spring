package com.treinamento_devsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treinamento_devsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
