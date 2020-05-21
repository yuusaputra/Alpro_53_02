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
public class b_MergeSort {
    
    private static int[] mergeSort(int[] angka) {

	if (angka.length <= 1) {
		return angka;
	}
	
	int tengah = angka.length / 2;
	int[] kiri = new int[tengah];
	int[] kanan;

	if (angka.length % 2 == 0) {
		kanan = new int[tengah];
	} else {
		kanan = new int[tengah + 1];
	}

	for (int i = 0; i < tengah; i++) {
		kiri[i] = angka[i];
	}

	for (int j = 0; j < kanan.length; j++) {
		kanan[j] = angka[tengah + j];
	}

	int[] hasil = new int[angka.length];

	kiri = mergeSort(kiri);
	kanan = mergeSort(kanan);
	hasil = merge(kiri, kanan);

	return hasil;
    }

    private static int[] merge(int[] kiri, int[] kanan) {

	int[] hasil = new int[kiri.length + kanan.length];
	int leftPointer, rightPointer, resultPointer;
	leftPointer = rightPointer = resultPointer = 0;

	while (leftPointer < kiri.length || rightPointer < kanan.length) {
		if (leftPointer < kiri.length && rightPointer < kanan.length) {
			if (kiri[leftPointer] < kanan[rightPointer]) {
				hasil[resultPointer++] = kiri[leftPointer++];
			} else {
				hasil[resultPointer++] = kanan[rightPointer++];
			}
		} 
		else if (leftPointer < kiri.length) {
			hasil[resultPointer++] = kiri[leftPointer++];
		} else if (rightPointer < kanan.length) {
			hasil[resultPointer++] = kanan[rightPointer++];
		}
	}

	return hasil;
    }

public static void main(String[] args) {

	int[] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	angka = mergeSort(angka);
	
        for(int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }

}
}

