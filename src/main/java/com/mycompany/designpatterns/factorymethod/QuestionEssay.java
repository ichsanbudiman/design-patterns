/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.factorymethod;

/**
 *
 * @author Ichsan Budiman
 * @since Dec 1, 2021
 */
@Deprecated
public class QuestionEssay implements Question{

    @Override
    public void execute() {
        System.out.println("pemeriksaan essay");
    }
    
}
