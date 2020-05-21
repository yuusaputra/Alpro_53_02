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
public class a_LongestCommonSubstring {
    public static void main(String[] args) {
        String teks_1 = "ALGORITMA_DAN_PEMROGRAMAN"; 
        String teks_2 = "DASAR_PEMROGRAMAN";
        
        char[] x = teks_1.toCharArray(); 
        char[] y = teks_2.toCharArray(); 
        int m = x.length; 
        int n = y.length; 
        
        int LCS[][] = new int[m+1][n+1];
        int hasil = 0;
        
        for(int i  = 0; i <= m; i++){
            for(int j = 0; j <=n; j++){
                if(i == 0 || j == 0){
                    LCS[i][j] = 0;
                } else if(x[i-1] == y[j-1]){
                    LCS[i][j] = LCS[i-1][j-1] + 1;
                    hasil = Math.max(hasil, LCS[i][j]);
                } else {
                    LCS[i][j] = 0;
                }
            }
        }
        System.out.println("Panjang Maksimal LCSubstring-nya adalah = " + LCS[m][n]);
    }
}
