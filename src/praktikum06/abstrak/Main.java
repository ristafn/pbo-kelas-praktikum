package praktikum06.abstrak;

public class Main {

    public static void main(String[] args){
        Persegi persegi = new Persegi(5);
        double luasPersegi = persegi.luas();
        double kelilingPersegi = persegi.keliling();

        System.out.println("Luas persegi : " + luasPersegi);
        System.out.println("Keliling persegi : " + kelilingPersegi);

        PersegiPanjang persegiPanjang = new PersegiPanjang(10,5);
        double luas = persegiPanjang.luas();
        double keliling = persegiPanjang.keliling();
        System.out.println(luas);
        System.out.println(keliling);
    }
}
