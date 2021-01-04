package kelas.pertemuan05;

public class BankAccount{
    private double balance;
    //add property account name
    private String accountName;
    //construct overload without argument
    public BankAccount(){
        balance=0;
        //initialize account name
        accountName="";
    }
    //construct overload with argument
    public BankAccount(String accountName){
        this.accountName = accountName;
    }
    //method detail account(account name dan balance)
    public void getAll(){
        System.out.println("Account name : " + accountName);
        System.out.println("Balance : " + balance);
    }
    public void name(String name){
        accountName = name;
    }
    public void deposit(double amount){
        balance = balance + amount;
    }
    //add method transfer
    public void transfer(double amount, BankAccount dest){
        balance = balance - amount;
        dest.deposit(amount);
    }
}