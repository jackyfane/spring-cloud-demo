package com.yaomalang.springclouddemo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "game")
public class Game {

    @Id
    private int game_id; // int(11)
    private int league_id; // int(11)
    private String season; // varchar(20)
    private Date game_time; // datetime
    private String round; // varchar(8)
    private String sporttery_seq; // varchar(6)
    private String sporttery_week; // varchar(6)
    private int home_id; // int(11)
    private int away_id; // int(11)
    private int home_goals; // smallint(2)
    private int away_goals; // smallint(2)
    private int home_half_goals; // smallint(2)
    private int away_half_goals; // smallint(2)
    private String final_handicap; // varchar(8)
    private String half_handicap; // varchar(8)
    private String final_goals; // varchar(8)
    private String half_goals; // varchar(8)
    private String result; // varchar(2)
    private String weather; // varchar(45)
    private String temperature; // varchar(45)
    private String stats_before_ten; // json
    private String stats_before_three; // json
    private String stats_after; // json
    private boolean is_bet_odds;
}
