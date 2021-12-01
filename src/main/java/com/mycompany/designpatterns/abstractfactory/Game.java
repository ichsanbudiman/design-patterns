/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.abstractfactory;

/**
 *
 * @author Ichsan Budiman
 * @since Dec 1, 2021
 */
public class Game {
    private Level level;
    private Arena arena;

    public Game(GameFactory gameFactory) {
        this.level = gameFactory.createLevel();
        this.arena = gameFactory.createArena();
    }
    
    public void start(){
        this.level.start();
        this.arena.start();
    }
}
