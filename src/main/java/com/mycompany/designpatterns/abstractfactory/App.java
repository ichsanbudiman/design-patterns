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
public class App {
    public void test(){
//        Game gameEasy = new Game(new LevelEasy(), new ArenaEasy());
//        gameEasy.start();
//        Game gameMedium = new Game(new LevelMedium(), new ArenaMedium());
//        gameMedium.start();
        
        
        Game gameEasy = new Game(new GameFactoryEasy());
        gameEasy.start();
    }
}
