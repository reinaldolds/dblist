package com.Lista_online.pageSpring.repositories;

import com.Lista_online.pageSpring.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
