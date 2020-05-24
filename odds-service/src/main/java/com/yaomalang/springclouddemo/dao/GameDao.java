package com.yaomalang.springclouddemo.dao;

import com.yaomalang.springclouddemo.entity.Game;
import org.springframework.data.annotation.Persistent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

@Persistent
public interface GameDao extends JpaRepository<Game, Integer> , JpaSpecificationExecutor<Game> {
}
