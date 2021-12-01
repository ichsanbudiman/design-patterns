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
public class GameFactoryMedium implements GameFactory{

    @Override
    public Level createLevel() {
        return new LevelMedium();
    }

    @Override
    public Arena createArena() {
        return new ArenaMedium();
    }
    
}
