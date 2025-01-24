package com.Lista_online.pageSpring.services;


import com.Lista_online.pageSpring.dtos.GameDTO;
import com.Lista_online.pageSpring.entities.Game;
import com.Lista_online.pageSpring.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameDTO> dto = result.stream().map(GameDTO::new).collect(Collectors.toList());
        return dto;
    }


    /*
    aqui é método que retorna a lista completa dos dados.
    public List<Game> findAll(){
        List<Game> result = gameRepository.findAll();
        return result;
    } */
}
