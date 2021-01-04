package praktikum10.fileStream.read;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args){
        try {
            File baca = new File("C:\\Users\\Rista F.N\\Desktop\\MATERI KULIAH\\Semester 3\\PBO\\Praktikum\\Pemrograman-berbasis-object\\tugas&materi\\src\\praktikum10\\fileStream\\file\\output.txt");
            Scanner alatBaca = new Scanner(baca);
//            System.out.println(alatBaca.nextLine()); menampilkan output perbaris
            while(alatBaca.hasNextLine()){
                String data = alatBaca.nextLine();
                System.out.println(data);
            }
        } catch (NoSuchElementException e) {
            System.out.println("baris tidak ditemukan");
        } catch (FileNotFoundException a){
            System.out.println("File tidak ditemukan");
        }
    }
}
