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
public class k {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.print("Angka-angka yang setelahnya bernilai lebih besar dalam array tersebut adalah ");
        for(int i = 0; i < angka.length - 1; i++){
            if(angka[i] > angka[i+1]){
                System.out.print(angka[i+1]+" ");
            }
        }
    }
}
