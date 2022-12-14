package com.mycompany.studi.kasus.restoran;

/**
 *
 * @author Ananta D
 */
public class Penjualan {
    private String nama_produk;
    private int quantity;
    private double harga_total;
    private static byte id = 0;
    
    // constructor
    public Penjualan(String nama_produk, int quantity, double harga_total) {
        this.nama_produk = nama_produk;
        this.quantity = quantity;
        this.harga_total = harga_total;
    }
    
    // accessor
    public String getNamaProduk() {
        return nama_produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getHargaTotal() {
        return harga_total;
    }
    
    public static byte getCurrentPenjualanId() {
        return id;
    }
    
    // mutator
    public static void nextId() {
        id++;
    }
}
