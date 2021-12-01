/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.singleton;

/**
 *
 * @author Ichsan Budiman
 * @since Dec 1, 2021
 */
public class SingletonClass {
    private SingletonClass singletonClass;

    public SingletonClass() {
    }
    
    public SingletonClass getInstance(){
        if (singletonClass==null) {
            singletonClass = new SingletonClass();
        }
        return singletonClass;
    }
}
