/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class a_Euclidean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan m = ");
        int m = in.nextInt();
        System.out.print("Masukkan n = ");
        int n = in.nextInt();
        int r;
        int bil_1 = m;
        int bil_2 = n;

        if(n == 0){
            System.out.println("PBB(" +bil_1+","+bil_2+") = " +m);
        } else {
            while(n != 0){
                r = m % n;
                m = n;
                n = r;
            } System.out.println("PBB(" +bil_1+","+bil_2+") = " +m);
        }
    }
}