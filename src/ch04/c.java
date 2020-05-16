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
public class c {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i = 0;
        System.out.print("Angka-angka ganjil pada array tersebut adalah ");
        do{
            if(angka[i] % 2 != 0){
                System.out.print(angka[i]+" ");
            }
            i++;
        }while (i < angka.length);
    }
}

