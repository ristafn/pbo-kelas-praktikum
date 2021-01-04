package praktikum08;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePertama {
    public static void main(String[] args){
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Fatih");
        queue.add("Hardi");
        queue.add("Karan");
        queue.add("Yuna");
        queue.add("Fatma");
        System.out.println("head : " + queue.element());
        System.out.println("head " + queue.peek());
        System.out.println("iterating the queue elements : ");

        Iterator itr =  queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        queue.remove();
        queue.poll(); //when no value in queue return null
        System.out.println("after removing two elements : ");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

    }
}
