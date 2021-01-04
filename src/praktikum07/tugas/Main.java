package praktikum07.tugas;

public class Main {
    public static void main(String[] args){
        Warung1 warung1 = new Warung1();
        Warung2 warung2 = new Warung2();

        warung1.pembeli("Sarif");
        System.out.println("Pembeli dari " + warung1.pembeliDari() + " : " + warung1.pembeli());
        System.out.println("Barang yang dibeli : " + warung1.jenisBarang());
        System.out.println("Jumlah barang yang dibeli : " + warung1.jumlahBarang() + " pack");
        System.out.println("Dikirim ke alamat : " + warung1.alamat());

        System.out.println("");

        warung2.pembeli("Toni");
        System.out.println("Pembeli dari " + warung2.pembeliDari() + " : " + warung2.pembeli());
        System.out.println("Barang yang dibeli : " + warung2.jenisBarang());
        System.out.println("Jumlah barang yang dibeli : " + warung2.jumlahBarang() + " karung");
        System.out.println("Dikirim ke alamat : " + warung2.alamat());
    }
}
