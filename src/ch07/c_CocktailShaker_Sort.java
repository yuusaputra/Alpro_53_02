/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;

/**
 *
 * @author Asus
 */
public class c_CocktailShaker_Sort {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        boolean tukar = true;
        int mulai = 0;
        int akhir = angka.length;
        
        while(tukar == true){
            tukar = false;
            
            for(int i = 0; i < akhir - 1; i++){
                if(angka[i] > angka[i+1]){
                    int baru = angka[i];
                    angka[i] = angka[i+1];
                    angka[i+1] = baru;
                    tukar = true;
                }
            }
            if(tukar = false){
                break;
            }
            tukar = false;
            akhir--;
            for(int i = akhir - 1; i >= mulai; i--){
                if(angka[i] > angka[i+1]){
                    int baru = angka[i];
                    angka[i] = angka[i+1];
                    angka[i+1] = baru;
                    tukar = true;
                }
            }
            mulai++;
        }
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
    }
}
