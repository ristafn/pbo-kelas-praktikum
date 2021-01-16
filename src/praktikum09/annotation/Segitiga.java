package praktikum09.annotation;

public class Segitiga extends BangunDatar{

    Segitiga(int panjang, int lebar){
        super(panjang, lebar);
    }

    @Deprecated
    String luasSegitiga(){
        return "Nilai luas adalah 30";
    }
}
