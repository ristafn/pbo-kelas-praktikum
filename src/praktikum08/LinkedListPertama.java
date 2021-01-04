package praktikum08;

import java.util.LinkedList;

public class LinkedListPertama {
    public static void main(String[] args){
        LinkedList item = new LinkedList();
//        LinkedList <String> item = new LinkedList<String>(); convert all object in item to String

        item.add("Hinata Shoyo");
        item.add("Kageyama Tobio");

        // or using

//        item.addFirst("Hinata Shoyo");
//        item.addLast("Kageyama Tobio");

        System.out.println("Outside hitter : " + item.get(0));
        System.out.println("Setter : " + item.get(1));

        System.out.println("");

        System.out.println("=== Change Setter===");
        String keluar = (String) item.get(1); //Convert object to String 1 value
        System.out.println("Player out : " + keluar);
        item.set(1, "Miya Atsumu");

        System.out.println("Player in : " + item.get(1));
    }
}
