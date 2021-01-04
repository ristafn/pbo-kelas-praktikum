package praktikum05;
import java.util.Scanner;

import static praktikum05.Statistik.*;

class Kalkulator{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        // input panjang array dari user
        System.out.print("Masukkan jumlah angka = ");
        int jumlah = scan.nextInt();

        int[] a = new int[jumlah];
        int n = a.length;

        for(int j=0; j<n; j++){
            System.out.print("Masukkan angka = ");
            a[j] = scan.nextInt();
        }


        // panggil function
        System.out.println("Mean = " + mean(a, n));
        System.out.println("Median = " + median(a, n));
        System.out.println("Modus = " + modus(a, n));
    }
}