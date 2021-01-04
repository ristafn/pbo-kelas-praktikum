package praktikum10.fileStream.delete;

import java.io.File;

public class HapusFile {
    public static void main(String[] args){
        File hapus = new File("C:\\Users\\Rista F.N\\Desktop\\MATERI KULIAH\\Semester 3\\PBO\\Praktikum\\Pemrograman-berbasis-object\\tugas&materi\\src\\praktikum10\\fileStream\\file\\tulisan.txt");
        if(hapus.delete()){
            System.out.println("File yang dhihapus = "+ hapus.getName());
        } else {
            System.out.println("gagal menghapus file");
        }
    }
}
