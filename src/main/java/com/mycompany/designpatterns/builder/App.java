/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.designpatterns.builder;

/**
 *
 * @author Ichsan Budiman
 * @since Dec 1, 2021
 */
public class App {

    public void test(){
//        Mahasiswa mhs1 = new Mahasiswa("093040033", "Ichsan", "Informatika", 28,"membaca","087809860");
//        Mahasiswa mhs2 = new Mahasiswa("23515033", "Budi", "Informatika", 30,"menulis","08303030756");

        Mahasiswa mhs1 = new MahasiswaBuilder()
                .setNim("23515033")
                .setNama("Ichsan")
                .setJurusan("Informatika")
                .setPhone("0008798")
                .setUmur(28)
                .build();
                
        Mahasiswa mhs2 = new MahasiswaBuilder()
                .setNim("123456")
                .setNama("Budi")
                .setJurusan("Kimia")
                .build();
        
    }
}
