/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04;

/**
 *
 * @author Asus
 */
public class h {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i = 0;
        int total = 0;
        
        do{
            total += angka[i];
            i++;
        }while (i < angka.length);
        System.out.println("Penjumlahan seluruh angka di dalam array tersebut adalah "+total);
    } 
}
