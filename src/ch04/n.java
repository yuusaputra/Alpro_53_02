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
public class n {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;
        for(int i = 1; i < angka.length + 1; i++){
            for(int k = 0; k < i; k++){
                total += angka[k];
            } 
            System.out.print(total + " ");
            total = 0;
            for(int j = 0; j < i; j++){
                System.out.print(angka[j] + " ");
            }
            System.out.println(" ");
        } 
    }
}
