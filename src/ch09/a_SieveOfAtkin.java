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
public class a_SieveOfAtkin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan batas bilangan = ");
        int batas = in.nextInt();
       
        boolean sieve[] = new boolean[batas + 1];
        System.out.print("Bilangan prima-nya adalah : ");
        
        sieve[0] = sieve[1] = sieve[4] = false;
        sieve[2] = sieve[3] = true;
        
        for(int i = 5; i <= batas; i++){
            sieve[i] = false;
        }
        for (int x = 1; x <= Math.sqrt(batas); x++) { 
            for (int y = 1; y <= Math.sqrt(batas); y++) { 
                int persamaan = (4 * x * x) + (y * y);
                if(persamaan <= batas && (persamaan % 12 == 1 || persamaan % 12 == 5)){
                    sieve[persamaan] = true;
                }
                persamaan = (3 * (x * x)) + (y * y);
                if(persamaan <= batas && persamaan % 12 == 7){
                    sieve[persamaan] = true;
                }
                persamaan = (3 * (x * x)) - (y * y);
                if(persamaan <= batas && x > y && persamaan % 12 == 11)
                    sieve[persamaan] = true;
                }
                for (int r = 5; r * r < batas; r++) { 
                    if (sieve[r]) { 
                        for (int i = r * r; i < batas; i += r * r){ 
                            sieve[i] = false; 
                        } 
                    }  
                }
        }
        
        for (int a = 0; a <= batas; a++){
            if (sieve[a] == true){
                System.out.print(a + " "); 
            }
        }
    }
}       


