package praktikum10;

public class ErrorFile {
    static void checkUmur(int umur){
        if(umur < 13){
            throw new ArithmeticException("Umur belum mencukupi, akses tidak diberikan");
        } else {
            System.out.println("Umur mencukupi, akses file diberikan");
        }
    }

    public static void main(String[] args){
        checkUmur(20);

        try{
            checkUmur(7);
        } catch (ArithmeticException e){
            System.out.println("Errornya adalah = " + e);
        } finally {
            System.out.println("Kode ini dijalankan");
        }
    }

}
