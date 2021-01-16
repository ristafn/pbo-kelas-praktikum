package praktikum10.tugas.delete;

import java.io.File;

public class HapusFile {
    public static void main(String[] args){
        File hapus = new File("src/praktikum10/tugas/output/filebaru(transaksi).txt");
        if(hapus.delete()){
            System.out.println("File yang dihapus : " + hapus.getName());
        } else {
            System.out.println("Gagal menghapus file");
        }
    }
}
