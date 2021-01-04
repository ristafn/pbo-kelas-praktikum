package kelas.pertemuan05;

public class DemoBankAccount{
    public static void main(String args[]){
        /* create instance */
        BankAccount b1 = new BankAccount("Jhomn");
        BankAccount b2 = new BankAccount();

        b1.deposit(200);
        b2.name("Sandit");
        b2.deposit(200);

        System.out.println("===Account Before Transfer===");
        b1.getAll();
        System.out.println("=============================");
        b2.getAll();
        System.out.println("=============================");
        System.out.println("===Account After Transfer===");
        b1.transfer(20,b2);
        b1.getAll();
        System.out.println("=============================");
        b2.getAll();
        System.out.println("=============================");
    }
}
