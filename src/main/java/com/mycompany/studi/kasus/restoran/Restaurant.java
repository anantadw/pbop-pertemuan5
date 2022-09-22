/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studi.kasus.restoran;

/**
 *
 * @author Ananta D
 */
public class Restaurant {
    public String[] nama_makanan;
    public double[] harga_makanan;
    public int[] stok;
    public static byte id = 0;
    
    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock()) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]" + "\tRp " + harga_makanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock() {
        if (stok[id] == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void nextId() {
        id++;
    }
}
