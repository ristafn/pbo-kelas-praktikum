package praktikum10.tugas.delete;

import java.io.File;

public class HapusFolder {
    public static void main(String[] args){
        File hapus = new File("src/praktikum10/tugas/output");
        if(hapus.delete()){
            System.out.println("Delete the folder  : " + hapus.getName());
        } else {
            System.out.println("Failed to delete the folder");
        }
    }
}
