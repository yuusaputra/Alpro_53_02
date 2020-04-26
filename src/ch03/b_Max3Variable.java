package ch03;

import java.util.Scanner;
public class b_Max3Variable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("x = ");
        int x = in.nextInt();
        System.out.print("y = ");
        int y = in.nextInt();
        System.out.print("z = ");
        int z = in.nextInt();
              
        if(x > y && x > z){
            System.out.println(x + " adalah nilai terbesar");
        }
        else if(y > x && y > z){
            System.out.println(y + " adalah nilai terbesar");
        }
        else {
            System.out.println(z + " adalah nilai terbesar");
        }
    }
}
