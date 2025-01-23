package com.mygamelist.mygamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mygamelist.mygamelist.dto.GameDTO;
import com.mygamelist.mygamelist.dto.GameMinDTO;
import com.mygamelist.mygamelist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAllGames() {
		List<GameMinDTO> result = gameService.findAllGames();
		return result;
	}
	
	@GetMapping(value = "/{id}")
	public GameDTO findGameById(@PathVariable Long id) {
		GameDTO result = gameService.findGameById(id);
		return result;
	}
}