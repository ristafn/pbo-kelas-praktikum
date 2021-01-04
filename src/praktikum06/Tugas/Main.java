package praktikum06.Tugas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Program hitung bangun datar =====");
        System.out.println("1. luas \n2. keliling");
        System.out.print("Masukkan pilihan : ");
        int pilihan1 = scanner.nextInt();
        if (pilihan1 == 1) {
            System.out.println("1. luas persegi \n2. luas persegi panjang");
            System.out.print("Masukkan pilihan : ");
            int pilihan2 = scanner.nextInt();

            //  luas persegi
            if (pilihan2 == 1) {
                int s = 0;
                System.out.print("Masukkan sisi : ");
                s = scanner.nextInt();
                BangunDatar bangunDatar = new BangunDatar(s, s);
                System.out.println("Luas persegi : " + bangunDatar.persegiL());
            }
            //   luas persegi panjang
            else if (pilihan2 == 2) {
                int p = 0;
                int l = 0;
                System.out.print("Masukkan panjang : ");
                p = scanner.nextInt();
                System.out.print("Masukkan lebar : ");
                l = scanner.nextInt();
                BangunDatar bangunDatar = new BangunDatar(p, l);
                System.out.println("Luas persegi : " + bangunDatar.persegiPanjangL());
            } else {
                System.out.println("Error");
            }
        } else if (pilihan1 == 2) {
            System.out.println("1. keliling persegi \n2. keliling persegi panjang");
            System.out.print("Masukkan pilihan : ");
            int pilihan2 = scanner.nextInt();

            //  keliling persegi
            if (pilihan2 == 1) {
                int s = 0;
                System.out.print("Masukkan sisi : ");
                s = scanner.nextInt();
                BangunDatar bangunDatar = new BangunDatar(s, 0);
                System.out.println("Keliling persegi : " + bangunDatar.persegiK());
            }
            //  keliling persegi panjang
            else if (pilihan2 == 2) {
                int p = 0;
                int l = 0;
                System.out.print("Masukkan panjang : ");
                p = scanner.nextInt();
                System.out.print("Masukkan lebar : ");
                l = scanner.nextInt();
                BangunDatar bangunDatar = new BangunDatar(p, l);
                System.out.println("Keliling persegi panjang: " + bangunDatar.persegiPanjangK());
            }
        }

        System.out.println();

        System.out.println("==== Rumus lain yang bisa dipakai ====");
        BangunDatar bangunDatar = new BangunDatar(1,1);
        System.out.println("1. Penjumlahan : 1 + 1 = " + bangunDatar.penjumlahan() + "\n2. Pengurangan : 1 - 1 =" +
                bangunDatar.pengurangan() + "\n3. Pembagian : 1 / 1 = " + bangunDatar.bagi() +
                "\n4. Perkalian : 1 x 1 = " + bangunDatar.kali() + "\n5. Pangkat : 1 pangkat 1 = " + bangunDatar.pangkat() +
                "\n6. Sisa bagi : 1 % 1 = " + bangunDatar.sisaBagi()
        );

    }
}
