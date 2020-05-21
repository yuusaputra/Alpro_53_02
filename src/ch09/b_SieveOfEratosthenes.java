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
public class b_SieveOfEratosthenes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan = ");
        int batas = in.nextInt();
        boolean sieve[] = new boolean[batas+1];
        System.out.print("Bilangan prima-nya adalah : ");
        for(int i = 0; i < batas; i++){
            sieve[i] = true;
        }
        
        for(int a = 2; a * a <= batas; a++){
            if(sieve[a]){
                for(int b = a * a; b <= batas; b += a){
                    sieve[b] = false;
                }
            }
        }
        for(int i = 2; i <= batas; i++){
            if(sieve[i]){
                System.out.print(i + " ");
            }
        }
    }
}
