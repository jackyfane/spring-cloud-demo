package com.yaomalang.springclouddemo.service;

import com.yaomalang.springclouddemo.entity.Game;

public interface GameService {
    public Game findOne(int gameId);

    public void save(Game game);

    public void update(Game game);

    public void delete(int gameId);
}
