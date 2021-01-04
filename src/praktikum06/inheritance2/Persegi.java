package praktikum06.inheritance2;

public class Persegi extends BangunDatar{
    double sisi;

    public Persegi(double sisi){
        this.sisi = sisi;
    }

    //merubah isi method dengan override
    @Override
    double luas(){
        double nilai = this.sisi * this.sisi;
        double nilaiKedua = super.luas() * nilai;
        return nilaiKedua;
    }

    double keliling(){
        double nilai = 4 * this.sisi;
        return nilai;
    }
}
