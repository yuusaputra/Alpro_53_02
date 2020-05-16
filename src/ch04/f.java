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
public class f {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.print("Angka-angka ganjil yang diapit oleh angka genap di dalam array tersebut adalah ");
        for(int i = 0; i < angka.length - 2; i++){
            if(angka[i] % 2 == 0 && angka[i+1] % 2 != 0 && angka[i+2] % 2 == 0){
                System.out.print(angka[i+1]+" ");
            }
        }
    }
}
