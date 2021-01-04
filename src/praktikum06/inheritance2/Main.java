package praktikum06.inheritance2;

public class Main {

    public static void main(String[] args){
        Persegi persegi = new Persegi(5);
        double luasPersegi = persegi.luas();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas persegi : " + luasPersegi);
        System.out.println("Keliling persegi : " + kelilingPersegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        BangunDatar bangunDatar = new BangunDatar();

        System.out.println(bangunDatar.luas());
        System.out.println(bangunDatar.keliling());
        System.out.println(persegiPanjang.luasDanKeliling());
    }
}
