package praktikum06.Tugas;

public class BangunDatar extends Rumus{
    public BangunDatar(int a, int b) {
        super(a, b);
    }

    //  persegi
    //  luas
    int persegiL(){
        return kali();
    }

    //  keliling
    int persegiK(){
        return 4 * a;
    }

    //  persegi panjang
    //  luas
    int persegiPanjangL(){
        return kali();
    }
    //  keliling
    int persegiPanjangK(){
        return 2 * penjumlahan();
    }
}
