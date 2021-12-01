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
public class MahasiswaBuilder {
    private String nim;
    private String nama;
    private String Jurusan;
    private int umur;
    private String hobi;
    private String phone;
    private String jenisKelamin;

    public MahasiswaBuilder setNim(String nim) {
        this.nim = nim;
        return this;
    }

    public MahasiswaBuilder setNama(String nama) {
        this.nama = nama;
        return this;
    }

    public MahasiswaBuilder setJurusan(String Jurusan) {
        this.Jurusan = Jurusan;
        return this;
    }

    public MahasiswaBuilder setUmur(int umur) {
        this.umur = umur;
        return this;
    }

    public MahasiswaBuilder setHobi(String hobi) {
        this.hobi = hobi;
        return this;
    }

    public MahasiswaBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public MahasiswaBuilder setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
        return this;
    }
    public Mahasiswa build(){
        return new Mahasiswa(this.nim, this.nama, this.Jurusan, this.umur, this.hobi, this.phone,this.jenisKelamin);
    }
}
