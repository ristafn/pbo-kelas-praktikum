package praktikum07.tugas;

public class Warung2 implements Distributor{

    private static String pembelDari = "Warung2";
    private static String pembeli = "Toni";
    private static String jenisBarang = "Beras";
    private static int jumlahBarang = 2;
    private static String alamat = "Jl. Raya Kuvukiland no.100";

    @Override
    public String pembeliDari() {
        return pembelDari;
    }

    @Override
    public String pembeli() {
        return pembeli;
    }

    @Override
    public String jenisBarang() {
        return jenisBarang;
    }

    @Override
    public int jumlahBarang() {
        return jumlahBarang;
    }

    @Override
    public String alamat(){
        return alamat;
    }
}
