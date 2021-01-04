package praktikum07.tugas;

public class Warung1 implements Distributor{

    private static String pembelDari = "Warung1";
    private static String pembeli = "Sarif";
    private static String jenisBarang = "Rokok";
    private static int jumlahBarang = 5;
    private static String alamat = "Jl. Raya Kuvukiland no.20";

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
