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
public class Produk {
    private String nama;
    private int harga;
    private int stock;
    private String supplier;

    public Produk(String nama, int harga, int stock, String supplier) {
        this.nama = nama;
        this.harga = harga;
        this.stock = stock;
        this.supplier = supplier;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getStock() {
        return stock;
    }

    public String getSupplier() {
        return supplier;
    }

    
    public Produk clone(Produk produkk){
        return new Produk(produkk.nama, produkk.harga, produkk.stock, produkk.supplier);
    }
}
