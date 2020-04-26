package ch03;

import java.util.Scanner;
public class a_Max2Variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        
        if(x > y ){
            System.out.println(x + " adalah nilai tertinggi");
        }
        else {
            System.out.println(y + " adalah nilai tertinggi");
        }
    }
}
