package praktikum05.materi;

import praktikum05.Aritmatika;

public class MainConstruct {

    /*static digunakan untuk langsung menjalankan suatu method
    dalam method itu sendiri*/

    public static void main(String[] args){
        ConstructJava calcAritmatika = new ConstructJava(10,5);

        System.out.println("Nilai pertambahan calcAritmatika = " + calcAritmatika.pertambahan());
        System.out.println("Nilai pengurangan calcAritmatika = " + calcAritmatika.pengurangan());
    }
}
