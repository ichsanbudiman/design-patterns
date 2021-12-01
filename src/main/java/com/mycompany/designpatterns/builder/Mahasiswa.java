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
public class Mahasiswa {
    private String nim;
    private String nama;
    private String Jurusan;
    private int umur;
    private String hobi;
    private String phone;
    private String jenisKelamin;

    public Mahasiswa(String nim, String nama, String Jurusan, int umur, String hobi, String phone, String jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.Jurusan = Jurusan;
        this.umur = umur;
        this.hobi = hobi;
        this.phone = phone;
        this.jenisKelamin = jenisKelamin;
    }
    
    
}
