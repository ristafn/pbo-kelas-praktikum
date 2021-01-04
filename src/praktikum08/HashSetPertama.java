package praktikum08;

import java.util.HashSet;

public class HashSetPertama {
    public static void main(String[] args){
        HashSet<String> item = new HashSet<String>();

        item.add("Pedang");
        item.add("1192");
        item.add("api");

        System.out.println("Itemnya adalah : " + item);

        System.out.println("\nHapus element api");
        item.remove("api");
        System.out.println("Tambah element air");
        item.add("air");

        System.out.println("\nItemnya sekarang adalah " + item);

        System.out.println("Ukuran Itemnya : " + item.size());
        System.out.println("Apakah ada elemen air didalam item? : " + item.contains("air"));

        for(String i: item){
            System.out.println(i);
        }
    }
}
