package com.mycompany.studi.kasus.restoran;

/**
 *
 * @author Ananta D
 */
public class Restaurant {
    Produk[] makanan;
    Penjualan[] data_penjualan;
    
    public Restaurant(int banyak_menu) {
        makanan = new Produk[banyak_menu];
        data_penjualan = new Penjualan[2];
    }
    
    public void tambahMenuMakanan(String[][] data_makanan) {
        for (String[] menu : data_makanan) {
            byte id = Produk.getCurrentProdukId();
            makanan[id] = new Produk(menu[0], Double.parseDouble(menu[1]), Integer.parseInt(menu[2]));
            Produk.nextId();
        }
    }
    
    public void tambahDataPenjualan(byte id_makanan, int banyak_beli) {
        data_penjualan[Penjualan.getCurrentPenjualanId()] = new Penjualan(
                        makanan[id_makanan].getNamaProduk(), 
                        banyak_beli, 
                        makanan[id_makanan].getHarga() * banyak_beli);
        Penjualan.nextId();
    }
    
    public void tampilMenuMakanan() {
        System.out.println("\n========================================");
        System.out.println("                  Menu                  ");
        System.out.println("----------------------------------------");
        for (int i = 0; i < Produk.getCurrentProdukId(); i++) {
            if (!makanan[i].isOutOfStock(i)) {
                System.out.printf("%2d %-15s [%3d] Rp%5.2f%n", i + 1, 
                        makanan[i].getNamaProduk(), 
                        makanan[i].getQty(), 
                        makanan[i].getHarga());
            }
        }
        System.out.println("========================================");
    }
    
    public void tampilDataPenjualan() {
        double total = 0;
        
        System.out.println("\n----------------------------------------");
        System.out.println("Menu yang dibeli");
        System.out.println("----------------------------------------");
        for (int i = 0; i < Penjualan.getCurrentPenjualanId(); i++) {
            System.out.printf("%d %-15s [%3d] Rp%5.2f%n", i + 1, 
                    data_penjualan[i].getNamaProduk(),
                    data_penjualan[i].getQuantity(),
                    data_penjualan[i].getHargaTotal()
                    );
            total += data_penjualan[i].getHargaTotal();
        }
        System.out.println("----------------------------------------");
        System.out.println("Total\t\t\t: Rp" + total);
        System.out.println("----------------------------------------");
    }
}
