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
public class c_KMP {
    public static void main(String[] args) {
        String teks = "ABCDEEFFKGGIAAKDMKWMD";
        String pola = "KDM";
        
        int m = pola.length();
        int n = teks.length();
        
        int array[] = new int[m];
        int j = 0;
        
        int panjang = 0;
        int i = 1;
        array[0] = 0;
        
        while(i < m){
            if(pola.charAt(i) == pola.charAt(panjang)){
                panjang++;
                array[i] = panjang;
                i++;
            } else{
                if(panjang != 0){
                    panjang = array[panjang - 1];
                } else{
                    array[i] = panjang;
                    i++;
                }
            }
        }
        
        i = 0;
        while(i < n){
            if(pola.charAt(j) == teks.charAt(i)){
                j++;
                i++;
            }
            if(j == m){
                System.out.println("Pola ditemukan dimulai dari indeks " + (i - j));
                j = array[j - 1];
            } else if(i < n && pola.charAt(j) != teks.charAt(i)){
                if(j != 0){
                    j = array[j - 1];
                } else{
                    i = i + 1;
                }
            }
        }
    }
}
