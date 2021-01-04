package praktikum08;

import java.util.Stack;

public class StackPertama {
    public static void main(String[] args){
        Stack<String> stk = new Stack<String>();

        stk.push("farah");
        stk.push("billah");
        stk.push("nissa");

        System.out.println("Stack : " + stk);
        System.out.println("Stack paling atas adalah : " + stk.peek());
        System.out.println("Posisi farah ada di : " + stk.search("farah"));

        stk.pop();
        System.out.println("Stack : " + stk);
    }
}
