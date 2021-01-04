package praktikum06.abstrak;

public class Persegi extends BangunDatar {
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    //merubah isi method dengan override
    @Override
    double luas(){
        double nilai = this.sisi * this.sisi;
        return nilai;
    }

    double keliling(){
        double nilai = 4 * this.sisi;
        return nilai;
    }
}
