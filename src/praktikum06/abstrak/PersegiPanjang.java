package praktikum06.abstrak;

public class PersegiPanjang extends BangunDatar {

    double panjang;
    double lebar;

    public PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    double luas() {
        double nilai = panjang * lebar;
        return nilai;
    }

    @Override
    double keliling() {
        double nilai = 2 * (panjang + lebar);
        return nilai;
    }
}
