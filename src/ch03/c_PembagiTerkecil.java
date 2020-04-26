package ch03;

import java.util.Scanner;
public class c_PembagiTerkecil {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");
        int bil = in.nextInt();
        
        for(int faktor = 3; faktor <= bil; faktor++){
            if(bil % faktor == 0){
                System.out.println(faktor + " adalah pembagi terkecil");
                break;
            }
        }
    }
}