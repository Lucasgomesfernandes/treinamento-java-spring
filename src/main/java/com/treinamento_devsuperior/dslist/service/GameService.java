package com.treinamento_devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treinamento_devsuperior.dslist.dto.GameMinDTO;
import com.treinamento_devsuperior.dslist.entities.Game;
import com.treinamento_devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	public GameRepository gameRepository;

	public List<GameMinDTO> findAll() {

		List<Game> listGame = gameRepository.findAll();

		List<GameMinDTO> listGameMin = listGame.stream().map(x -> new GameMinDTO(x)).toList();
		
		return listGameMin;
	}

}
