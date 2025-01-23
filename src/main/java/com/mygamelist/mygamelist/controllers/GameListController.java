package com.mygamelist.mygamelist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mygamelist.mygamelist.dto.GameListDTO;
import com.mygamelist.mygamelist.dto.GameMinDTO;
import com.mygamelist.mygamelist.services.GameListService;
import com.mygamelist.mygamelist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAllGameLists() {
		List<GameListDTO> result = gameListService.findAllGameLists();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games")
	public List<GameMinDTO> findAllGamesByList(@PathVariable Long listId) {
		List<GameMinDTO> result = gameService.findAllGamesByList(listId);
		return result;
	}
}