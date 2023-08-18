package sampleAggrerationJava;

public class AbcBank {
    public static void main(String[] args) {
        Bank obj=new Bank();
        obj.getBalance();
        BankA a=new BankA();
        a.getBalance();
        BankB b=new BankB();
        b.getBalance();
        BankC c=new BankC();
        c.getBalance();
    }
}
