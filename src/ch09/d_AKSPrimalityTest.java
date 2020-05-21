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
public class d_AKSPrimalityTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan = ");
        int bil = in.nextInt();
        boolean test[] = new boolean[100];
        long c [] = new long[100];
        
        c[0] = 1;
        for(int i = 0; i < bil; c[0] = -c[0], i++){
            c[1 + i] = 1;
            
            for(int j = i; j > 0; j--){
                c[j] = c[j - 1] - c[j];
            }
        }
        c[0]++;
        c[bil]--;
        
        int i = bil;
        while((i--) > 0 && c[i] % bil == 0){
            if(i < 0){
                test[i] = true;
            } else {
                test[i] = false;
            }
        }
        if (test[bil] = true){
            System.out.println(bil + " merupakan bilangan Prima");
        } else {
            System.out.println(bil + " bukan merupakan bilangan Prima");
        }
    }
}
