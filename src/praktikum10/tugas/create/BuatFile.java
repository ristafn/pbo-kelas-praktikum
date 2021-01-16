package praktikum10.tugas.create;

import java.io.File;
import java.io.IOException;

public class BuatFile {
    public static void main(String[] args){
        try{
            File buatFile = new File("src/praktikum10/tugas/output/filebaru(transaksi).txt");
            if(buatFile.createNewFile()){
                System.out.println("Nama file adalah : " + buatFile.getName());
            } else {
                System.out.println("File sudah dibuat");
            }
        } catch (IOException e) {
            System.out.println("Terdapat error pada file");
            e.printStackTrace();
        }
    }
}
