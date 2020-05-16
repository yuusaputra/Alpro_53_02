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
public class l {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total;
        System.out.println("Jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap pada array tersebut adalah ");
        for(int i = 0; i < angka.length - 1; i++){
            total = angka[i] + angka[i+1];
            if(total % 2 == 0){
                System.out.println(angka[i] + " + " + angka[i+1] + " = " +total);
            }
        }
    }
}
