package praktikum10.fileStream.create;

import java.io.FileWriter;
import java.io.IOException;

public class TulisFile {
    public static void main(String[] args){
        try {
            FileWriter tulis = new FileWriter("C:\\Users\\Rista F.N\\Desktop\\MATERI KULIAH\\Semester 3\\PBO\\Praktikum\\Pemrograman-berbasis-object\\tugas&materi\\src\\praktikum10\\fileStream\\file\\output.txt");
            tulis.write("File ini kita tulis dari aplikasi yang kita buat");
            tulis.close();
            System.out.println("File berhasil ditulis");
        } catch (IOException e) {
            System.out.println("File error saat ditulis");
        }
    }
}
