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
public class d_LIS {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int LIS[] = new int[angka.length];
        int maks = 0;
        
        for(int i = 0; i < angka.length; i++){
            LIS[i] = 1;
        } 
        for(int i = 1; i < angka.length; i++){
            for(int j = 0; j < i; j++){
                if(angka[i] > angka[j] && LIS[i] < LIS[j] + 1){
                    LIS[i] = LIS[j] + 1;
                }
            }
        } 
        for(int i = 0; i < angka.length; i++){
            if(maks < LIS[i]){
                maks = LIS[i];
            }
        } System.out.println("Panjang maksimal LIS-nya adalah " + maks);
    }
}
