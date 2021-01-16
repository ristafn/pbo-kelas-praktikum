package praktikum10.tugas.create;

import java.io.FileWriter;
import java.io.IOException;

public class TulisFIle {
    public static void main(String[] args){
        try{
            FileWriter tulisFile = new FileWriter("src/praktikum10/tugas/output/filebaru(transaksi).txt");
            tulisFile.write("total belanja : Rp. 100.000,-");
            tulisFile.close();
            System.out.println("berhasil ditulis kedalam file");
        } catch (IOException e) {
            System.out.println("Terdapat error saat menulis kedalam file");
            e.printStackTrace();
        }
    }
}
