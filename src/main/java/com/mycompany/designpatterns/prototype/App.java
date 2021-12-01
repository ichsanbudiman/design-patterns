/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.prototype;

/**
 *
 * @author Ichsan Budiman
 * @since Dec 1, 2021
 */
public class App {
    
    public void test(){
        Produk monitor = new Produk("samsung", 4000000, 10, "pt.maju jaya");
        Produk monitorLg = new Produk("lg", 3000000, 5, monitor.getSupplier());
        Produk monitorAsus = new Produk("assus", monitor.getHarga(), monitorLg.getStock(), "pt.maju jaya");
        
        
    }

}
