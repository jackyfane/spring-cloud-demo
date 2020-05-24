package com.yaomalang.springclouddemo.service.impl;

import com.yaomalang.springclouddemo.dao.GameDao;
import com.yaomalang.springclouddemo.entity.Game;
import com.yaomalang.springclouddemo.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("gameService")
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDao gameDao;

    @Override
    public Game findOne(int gameId) {
        Optional<Game> game = gameDao.findById(gameId);
        return game.get();
    }

    @Override
    public void save(Game game) {
        gameDao.save(game);
    }

    @Override
    public void update(Game game) {
        gameDao.save(game);
    }

    @Override
    public void delete(int gameId) {
        gameDao.deleteById(gameId);
    }
}
