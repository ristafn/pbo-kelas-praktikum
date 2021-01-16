package praktikum10.tugas.read;

import java.io.File;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args){
        try{
            File myObj = new File("src/praktikum10/tugas/output/filebaru(transaksi).txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
