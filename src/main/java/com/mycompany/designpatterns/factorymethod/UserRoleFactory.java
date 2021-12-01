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
public class UserRoleFactory {

    public static UserRole adminFactory(String username){
        return new UserRole("admin", 0, username);
    }
    public static UserRole operatorFactory(String username){
        return new UserRole("operator", 1, username);
    }
    public static UserRole karyawanFactory(String username){
        return new UserRole("karyawan", 2, username);
    }
}
