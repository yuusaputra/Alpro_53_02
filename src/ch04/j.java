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
public class j {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int selisih; 
        System.out.print("Selisih angka-angka genap dengan angka setelahnya yang genap pula dalam array tersebut adalah ");
        
        for(int i = 0; i < angka.length; i++){
            if(angka[i] % 2 == 0){
                for(int j = i + 1; j < angka.length; j++){
                    if(angka[j] % 2 == 0){
                        selisih = angka[i] - angka[j];
                        System.out.print(selisih + " ");
                        break;
                    }
                }
            }
        }
    }
}
