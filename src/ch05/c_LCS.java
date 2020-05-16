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
public class c_LCS {
    public static void main(String[] args) {
        String teks_1 = "AUYTGHJK"; 
        String teks_2 = "ATDWAGH"; 

        char[] x = teks_1.toCharArray(); 
        char[] y = teks_2.toCharArray(); 
        int m = x.length; 
        int n = y.length; 
        
        int L[][] = new int[m+1][n+1]; 
        for (int i = 0; i <= m; i++){ 
            for (int j = 0; j <= n; j++){ 
                if (i == 0 || j == 0) 
                    L[i][j] = 0; 
                else if (x[i-1] == y[j-1]) 
                    L[i][j] = L[i-1][j-1] + 1; 
                else
                    L[i][j] = Math.max(L[i-1][j], L[i][j-1]); 
          } 
        }
        System.out.println("Panjang maksimal LCS-nya adalah " + L[m][n]);
    }
}
