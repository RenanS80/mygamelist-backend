package com.mygamelist.mygamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamelist.mygamelist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
