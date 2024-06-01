/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tesuas;
import java.util.Scanner;

/**
 *
 * @author RizkiMr
 */
public class Tesuas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        int a = scanner.nextInt();
        
        System.out.print("Masukkan nilai b: ");
        int b = scanner.nextInt();
        
        int hasil = CariNilaiPangkat(a, b);
        if (hasil == -1) {
            System.out.println("Nilai pangkat negatif tidak diperbolehkan.");
        } else if (hasil == -2) {
            System.out.println("Input melebihi batas yang diizinkan.");
        }else {
            System.out.println("Hasil pangkat dari " + a + "^" + b + " adalah: " + hasil);
        }
        
        scanner.close();
    }

     public static int CariNilaiPangkat(int a, int b) {
        if (b == 0) {
            return 1;
        } else if (b < 0) {
            return -1;
        } else if (b > 10 || a > 100) {
            return -2;
        } else {
            int result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
    }
}
