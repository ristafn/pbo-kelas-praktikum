package praktikum10.fileStream.create;

import java.io.File;
import java.io.IOException;

public class BuatFile {
    public static void main(String[] args){
        try{
            File buat = new File("C:\\Users\\Rista F.N\\Desktop\\MATERI KULIAH\\Semester 3\\PBO\\Praktikum\\Pemrograman-berbasis-object\\tugas&materi\\src\\praktikum10\\fileStream\\file\\output.txt");
            if (buat.createNewFile()){
                System.out.println("Nama file adalah : " + buat.getName());
            } else{
                System.out.println("File sudah dibuat");
            }
        } catch (IOException e){
            System.out.println("Terdapat error pada file");
        }
    }
}
