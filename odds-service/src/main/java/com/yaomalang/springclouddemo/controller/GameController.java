package com.yaomalang.springclouddemo.controller;

import com.yaomalang.springclouddemo.entity.Game;
import com.yaomalang.springclouddemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @RequestMapping("/{id}")
    protected Game getGameById(@PathVariable("id") Integer id) {
        Game game = gameService.findOne(id);
        return game;
    }


}
