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
public class UserRole {
    private String usertype;
    private int role;
    private String userId;

    public UserRole(String usertype, int role, String userId) {
        this.usertype = usertype;
        this.role = role;
        this.userId = userId;
    }

    
    
}
