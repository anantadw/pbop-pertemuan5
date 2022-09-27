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
    
    public Penjualan(String nama_produk, int quantity, double harga_total) {
        this.nama_produk = nama_produk;
        this.quantity = quantity;
        this.harga_total = harga_total;
    }

    public String getNamaProduk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getHargaTotal() {
        return harga_total;
    }

    public void setHarga_total(double harga_total) {
        this.harga_total = harga_total;
    }
    
    // methods
    public static byte getCurrentPenjualanId() {
        return id;
    }
    
    public static void nextId() {
        id++;
    }
}
