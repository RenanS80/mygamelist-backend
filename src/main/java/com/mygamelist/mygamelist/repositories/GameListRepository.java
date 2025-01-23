package com.mygamelist.mygamelist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mygamelist.mygamelist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
