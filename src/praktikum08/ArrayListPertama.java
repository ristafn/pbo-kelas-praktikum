package praktikum08;

import java.util.ArrayList;

public class ArrayListPertama {
    public static void main(String[] args){
        ArrayList item = new ArrayList(4);

        item.add("Hinata Shoyo");
        item.add("Kageyama Tobio");

        System.out.println("Outside hitter : " + item.get(0));
        System.out.println("Setter : " + item.get(1));

        System.out.println("");

        System.out.println("=== Change Setter===");
        String keluar = (String) item.get(1);
        System.out.println("Player out : " + keluar);
        item.set(1, "Miya Atsumu");

        System.out.println("Player in : " + item.get(1));
    }
}
