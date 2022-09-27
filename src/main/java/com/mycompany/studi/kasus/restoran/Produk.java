package com.mycompany.studi.kasus.restoran;

/**
 *
 * @author Ananta D
 */
public class Produk {
    // (1. always keep data private) modifier dari data/fields dibuat private
    // fields tidak dibuat array, karena 1 object dari class Produk 
    // merepresentasikan 1 makanan
    private String nama_produk;
    private double harga;
    private int qty;
    private static byte id = 0;
    
    // constructor
    public Produk(String nama_produk, double harga, int qty) {
        this.nama_produk = nama_produk;
        this.harga = harga;
        this.qty = qty;
    }
    
    // membuat accessor dan mutator
    public String getNamaProduk() {
        return nama_produk;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }
    
    // methods
    public static byte getCurrentProdukId() {
        return id;
    }
    
    public static void nextId() {
        id++;
    }
    
    public boolean isOutOfStock(int id) {
        return (qty == 0) ? true : false;
    }
    
    public void kurangiQty(int banyak) {
        qty -= banyak;
    }
}
