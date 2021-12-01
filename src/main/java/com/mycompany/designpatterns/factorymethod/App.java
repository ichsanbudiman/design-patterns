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
public class App {

    public void test(){
        UserRole admin = UserRoleFactory.adminFactory("ichsan");
        UserRole karyawan = new UserRole("karyawan", 4, "22324");
        UserRole operator = UserRoleFactory.operatorFactory("operator");
        
    }
    
    public void testQuestion(){
        Question Essay = new QuestionEssay();
        Question SC = new QuestionSingleChoice();
        
        Question essay = QuestionFactory.createEssay();
        Question sc = QuestionFactory.createSingleChoice();
        essay.execute();
        
    }
}
