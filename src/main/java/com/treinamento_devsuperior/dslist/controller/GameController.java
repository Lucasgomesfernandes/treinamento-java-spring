package com.treinamento_devsuperior.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treinamento_devsuperior.dslist.dto.GameMinDTO;
import com.treinamento_devsuperior.dslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping
	public List<GameMinDTO> findAll() {

		List<GameMinDTO> result = gameService.findAll();
		return result;
	}

}
