package com.mygamelist.mygamelist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mygamelist.mygamelist.dto.GameDTO;
import com.mygamelist.mygamelist.dto.GameMinDTO;
import com.mygamelist.mygamelist.entities.Game;
import com.mygamelist.mygamelist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAllGames() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	
	@Transactional(readOnly = true)
	public GameDTO findGameById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
}