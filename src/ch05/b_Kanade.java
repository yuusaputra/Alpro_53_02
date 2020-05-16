/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author Asus
 */
public class b_Kanade {
    public static void main(String[] args) {
        int[] angka = {82, -21, 41, 2, -38, 26, 20, 48, -1, 5, 8, -32, 3};
        int jumlah = 0;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < angka.length; i++){
            jumlah = jumlah + angka[i];
            
            if(max < jumlah){
                max = jumlah;
            }
            if(jumlah < 0){
                max = 0;
            }
        } System.out.println("Jumlah terbesar dari penjumlahan SubArray tersebut adalah " +max);
    }
}
