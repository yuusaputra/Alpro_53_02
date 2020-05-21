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
public class b_BoyerMoyerStringSearch {
    
    
    public static void main(String[] args) {
        char teks[] = "ALPRO".toCharArray(); 
        char pola[] = "PRO".toCharArray(); 
        int chars = 256;
        int m = pola.length;
        int n = teks.length;
        char []str = pola;
        
        int badchar [] = new int[chars];
        
        for(int i = 0; i < chars; i++){
            badchar[i] = -1;
        }
        for (int i = 0; i < m; i++){
            badchar[(int) str[i]] = i; 
        } 
        
        int s = 0;
        while(s <= (n - m)){
            int j = m - 1;
            
            while(j >= 0 && pola[j] == teks[s+j]){
              j--; 
            }
            
            if(j < 0){
                System.out.println("Pola ditemukan dimulai pada indeks " + s);
                s += (s+m < n)? m-badchar[teks[s+m]] : 1; 
                } else{
                    s += (1 > j - badchar[teks[s+j]])? 1: j - badchar[teks[s+j]];
                }
            
            
        }
    }
}
