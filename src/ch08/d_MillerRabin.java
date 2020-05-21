/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
import java.util.Random;
import java.math.BigInteger;

public class d_MillerRabin {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicek = ");
        long n = in.nextLong();
        boolean prima;
        int k = 2;
        if(n == 0 || n == 1){
            prima = false;
        }
        if(n == 2){
            prima = true;
        }
        if(n % 2 == 0){
            prima = false;
        }
        long s = n - 1;
        while(s % 2 == 0){
            s /= 2;
        }
        Random rand = new Random();
        for(int i = 1; i < k; i++){
            long r = Math.abs(rand.nextLong());
            long a = r % (n - 1) + 1, temp = s;
            long res = 1;
            for(int j = 0; j < temp; j++){
                res *= a;
                res %= n;
            } 
            while (temp != n - 1 && res != 1 && res != n - 1){
                res = BigInteger.valueOf(res).multiply(BigInteger.valueOf(res)).mod(BigInteger.valueOf(n)).longValue();
                temp *= 2;
            }
            if(res != n - 1 && temp % 2 == 0){
                prima = false;
            } else{
                prima = true;
            }
        }        
        if(prima = true){
            System.out.println(n + " adalah bilangan prima");
        } else{
            System.out.println(n + " bukan bilangan prima");
        }
    }
}


