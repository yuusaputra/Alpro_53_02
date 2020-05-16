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
public class i {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int i = 0;
        System.out.print("Selisih angka-angka dengan angka setelahnya di dalam array tersebut adalah ");
        do{
            int total = angka[i] - angka[i+1];
            System.out.print(total+ " ");
            i++;
        }while (i < angka.length-1);
    } 
}
