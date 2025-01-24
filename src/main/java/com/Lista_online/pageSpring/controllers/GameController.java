package com.Lista_online.pageSpring.controllers;


import com.Lista_online.pageSpring.dtos.GameDTO;
import com.Lista_online.pageSpring.entities.Game;
import com.Lista_online.pageSpring.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;


    @GetMapping
    public List<GameDTO> findAll(){
        List<GameDTO> result = gameService.findAll();
        return result;
    }

}
