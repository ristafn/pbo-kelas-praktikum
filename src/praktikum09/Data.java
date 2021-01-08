package praktikum09;

public class Data <T, K>{
    T nilaiPertama;
    K nilaiKedua;

    public Data (T nilaiPertama, K nilaiKedua){
        this.nilaiPertama = nilaiPertama;
        this.nilaiKedua = nilaiKedua;
    }

    public void showData(){
        System.out.println("Nilai pertama = " + nilaiPertama);
        System.out.println("Nilai Kedua = " + nilaiKedua);
    }

    public <E> void showDataBaru(E dataBaru){
        System.out.println("Nilai data baru = " + dataBaru);
    }
}
