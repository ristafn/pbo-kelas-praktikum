package praktikum10;

public class FileError {
    public static void main(String[] args){
        try{
            int[] dataAngka = {1,2,3,4};
            System.out.println(dataAngka[10]);
        } catch (Exception e){ //Exception e digunakan untuk menangkap semua error
            System.out.println("Index tidak diketahui");
        }
//        catch (ArrayIndexOutOfBoundsException){
//
//        }
//
//        catch (ArithmeticException){
//            System.out.println("ERROR");
//        }
    }
}
