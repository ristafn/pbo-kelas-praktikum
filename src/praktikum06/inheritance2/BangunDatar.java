package praktikum06.inheritance2;

public class BangunDatar {
    int panjang = 10;
    int lebar = 5;

    double luas(){
        int nilai = panjang * lebar;
        return nilai;
    }

    double keliling(){
        int nilai = 2 * (panjang + lebar);
        return nilai;
    }
}
