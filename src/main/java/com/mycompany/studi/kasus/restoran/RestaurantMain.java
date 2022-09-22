/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.studi.kasus.restoran;

/**
 *
 * @author Ananta D
 */
public class RestaurantMain {

    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Bala-bala", 1_000, 20);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Tahu", 1_000, 0);
        Restaurant.nextId();
        
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
    }
}
