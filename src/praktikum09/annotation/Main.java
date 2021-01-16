package praktikum09.annotation;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args){

        Segitiga tiga = new Segitiga(9, 30);

        System.out.println("Hasil dari luas segitiga : " + tiga.luasSegitiga());
    }
}
