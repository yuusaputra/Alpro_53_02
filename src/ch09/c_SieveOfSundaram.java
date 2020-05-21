/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class c_SieveOfSundaram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan = ");
        int batas = in.nextInt();
        int r = (batas - 2) / 2;
        boolean sieve[] = new boolean[r + 1];
        
        for(int i = 0; i <= r; i++){
            sieve[i] = false;
        }
        for(int i = 1; i <= r; i++){
            for(int j = i; (i + j + 2*i*j) <= r; j++){
                sieve[i + j + 2*i*j] = true;
            }
        }
        if(batas > 2){
            System.out.print("Bilangan prima-nya adalah : " + 2 + " ");
        }
        for(int i = 1; i <= r; i++){
                if(!sieve[i]){
                System.out.print(2* i + 1 + " ");
            }
        }
    }
}
