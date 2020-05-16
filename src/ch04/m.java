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
import java.util.ArrayList;
public class m {
    public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int[] angka2 = new int[angka.length];
        System.out.print("Jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap pada array tersebut adalah ");
        int total;
        int selisih;
        for(int i = 0; i < angka.length - 1; i++){
            total = angka[i] + angka[i+1];
            if(total % 2 == 0){
                System.out.print(total + " ");
                angka2[i] = total;
            }
        }
        System.out.println(" ");
        selisih = angka2[0];
        for(int j = 1; j < angka2.length-1; j++){
            selisih = selisih - angka2[j];
        }
        System.out.println("Jumlah angka-angka selisih dari angka tersebut adalah " + selisih);    
    }
}

