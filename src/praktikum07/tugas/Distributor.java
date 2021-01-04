package praktikum07.tugas;

public interface Distributor {
    public String pembeliDari();
    public String pembeli();
    public String jenisBarang();
    public int jumlahBarang();
    public String alamat();

    default void pembeli(String name){
        System.out.println("Pembeli atas nama " + name + ", resi pengiriman : ");
    }
}
