package praktikum10.fileStream.read;

import java.io.File;

public class FileBaca {
    public static void main(String[] args){
        File informasiFile = new File("C:\\Users\\Rista F.N\\Desktop\\MATERI KULIAH\\Semester 3\\PBO\\Praktikum\\Pemrograman-berbasis-object\\tugas&materi\\src\\praktikum10\\fileStream\\file\\output.txt");
        if(informasiFile.exists()){
            System.out.println(informasiFile.getName());
            System.out.println(informasiFile.getAbsoluteFile());
            System.out.println(informasiFile.canWrite());
            System.out.println(informasiFile.canRead());
            System.out.println(informasiFile.length());
        } else {
            System.out.println("File tidak diketahui");
        }
    }
}
