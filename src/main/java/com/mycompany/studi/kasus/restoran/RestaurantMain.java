package com.mycompany.studi.kasus.restoran;

import java.util.Scanner;

/**
 *
 * @author Ananta D
 */
public class RestaurantMain {
    
    public static void main(String[] args) {
        // menambahkan menu
        String[][] data_makanan = {
            {"Tahu", "2000", "30"},
            {"Tempe", "2000", "30"},
            {"Telur", "4000", "25"},
            {"Ayam Goreng", "12000", "25"},
            {"Ayam Geprek", "12500", "28"},
            {"Donat", "3000", "19"},
            {"Pisang Goreng", "2500", "22"},
            {"Air Mineral", "3500", "34"},
            {"Teh Kotak", "4500", "27"},
            {"Mie Goreng", "7000", "26"}
        };
        
        int banyak_menu = data_makanan.length;
        Restaurant restoran = new Restaurant(banyak_menu);
        restoran.tambahMenuMakanan(data_makanan);
       
        // pemesanan
        Scanner input = new Scanner(System.in);
        int pilihan, banyak_beli;
        char ulang;
        
        while (true) {
            restoran.tampilMenuMakanan();

            if (Penjualan.getCurrentPenjualanId() < 2 ) {
                System.out.print("\nPilh menu\t: ");
                pilihan = input.nextInt();
                if (pilihan < 1 || pilihan > banyak_menu) {
                    System.out.println("Tidak ada di pilihan.\n");
                    continue;
                }

                System.out.print("Banyak beli\t: ");
                banyak_beli = input.nextInt();
                if (banyak_beli < 1) {
                    System.out.println("Minimum pembelian 1.\n");
                    continue;
                } else if (banyak_beli > restoran.makanan[pilihan - 1].getQty()) {
                    System.out.println("Pembelian tidak bisa melebihi stok.\n");
                    continue;
                }
                
                restoran.makanan[pilihan - 1].kurangiQty(banyak_beli);
                restoran.tambahDataPenjualan((byte) (pilihan - 1), banyak_beli);
                restoran.tampilDataPenjualan();
                
                System.out.print("\nIngin membeli menu lain? <Y / T> : ");
                ulang = input.next().charAt(0);
                if (ulang == 'T' || ulang == 't') {
                    break;
                }
            } else {
                System.out.println("\nSudah mencapai maksimum pembelian (5)\n");
                break;
            }
        }
        
        System.out.println("\n========================================\n");
        System.out.println("Konfirmasi Pesanan");
        restoran.tampilDataPenjualan();
    }
}