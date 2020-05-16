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
import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.print("Angka yang ingin dicari = ");
        int cari = in.nextInt();
        
        int i = 0;
        do{
            int data = angka[i];
            if(cari == data){ 
                System.out.println(cari+" berhasil ditemukan pada indeks ke "+i );
                return;
            }
            i++;
        }while(i < angka.length);
        System.out.println("Maaf angka tidak dapat ditemukan");
    }
}
