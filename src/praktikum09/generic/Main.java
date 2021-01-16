package praktikum09.generic;

public class Main {
    public static void main(String[] args){
        Data <String,Integer> dataInt = new Data <String,Integer>("Nilai", 70);
        Data <String, Boolean> daatStr = new Data <String,Boolean>("Nurul", true);

        dataInt.showData();
        daatStr.showData();

        dataInt.showDataBaru("Adil");
        daatStr.showDataBaru(90);
    }
}
