/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.designpatterns.abstractfactory;

/**
 *
 * @author Asus
 */
public interface GameFactory {
    public Level createLevel();
    public Arena createArena();
}
