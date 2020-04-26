package ch03;

import java.util.Scanner;
public class d_Prima {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bil = in.nextInt();
        int b = 0;
        
        for(int a = 1; a <= bil; a++){
            if(bil % a == 0){
                b = b + 1;
            } 
        }
        if(b == 2){
            System.out.println(bil + " merupakan bilangan Prima");
        } else {
            System.out.println(bil + " bukan merupakan bilangan Prima");
        }
    }
}
