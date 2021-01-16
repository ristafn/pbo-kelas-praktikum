package praktikum10.tugas.read;

import java.io.File;

public class InformasiFile {
    public static void main(String[] args){
        File informasiFile = new File("src/praktikum10/tugas/output/filebaru(transaksi).txt");
        if(informasiFile.exists()){
            System.out.println("Nama file : " + informasiFile.getName());
            System.out.println("Alamat file : " + informasiFile.getAbsoluteFile());
            System.out.println("Apakah file boleh ditulis ? : " + informasiFile.canWrite());
            System.out.println("Apakah file data bisa dibaca : " + informasiFile.canRead());
            System.out.println("Ukuran file : " + informasiFile.length());
        } else {
            System.out.println("File tidak ada");
        }
    }
}
