/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07;

/**
 *
 * @author Asus
 */
public class a_BlockSort {
    static int RUN = 32; 
        
    public static void merge(int[] arr, int l, int m, int r)  
    {  
        
        int bagian_1 = m - l + 1;
        int bagian_2 = r - m;  
        int[] kiri = new int[bagian_1]; 
        int[] kanan = new int[bagian_2];  
        for (int x = 0; x < bagian_1; x++) 
            kiri[x] = arr[l + x];  
        for (int x = 0; x < bagian_2; x++)  
            kanan[x] = arr[m + 1 + x];  
        
        int i = 0;  
        int j = 0;  
        int k = l;  
        
        while (i < bagian_1 && j < bagian_2)  
        {  
            if (kiri[i] <= kanan[j])  
            {  
                arr[k] = kiri[i];  
                i++;  
            }  
            else
            {  
                arr[k] = kanan[j];  
                j++;  
            }  
            k++;  
        }  

        while (i < bagian_1)  
        {  
            arr[k] = kiri[i];  
            k++;  
            i++;  
        }  
         
        while (j < bagian_2)  
        {  
            arr[k] = kanan[j];  
            k++;  
            j++;  
        }  
    }
    
    public static void insertionSort(int[] arr, int kiri, int kanan)  
    {  
        for (int i = kiri + 1; i <= kanan; i++)  
        {  
            int temp = arr[i];  
            int j = i - 1;  
            while (j >= kiri && arr[j] > temp)  
            {  
                arr[j+1] = arr[j];  
                j--;  
            }  
            arr[j+1] = temp;  
        }  
    }  
        
    public static void blockSort(int[] arr, int n)  
    {  
        for (int i = 0; i < n; i+=RUN)  
            insertionSort(arr, i, Math.min((i+31), (n-1)));  
        
        for (int size = RUN; size < n; size = 2*size)  
        {  
            for (int kiri = 0; kiri < n; kiri += 2*size)  
            {  
                int tengah = kiri + size - 1;  
                int kanan = Math.min((kiri + 2*size - 1), (n-1));  

                merge(arr, kiri, tengah, kanan);  
            }  
        }  
    } public static void main(String[] args) {
        int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int n = angka.length;
        blockSort(angka, n);
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
    }
  
       
}
