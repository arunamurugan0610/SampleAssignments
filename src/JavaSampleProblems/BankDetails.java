package JavaSampleProblems;

import java.util.Scanner;

public class BankDetails {
    int amt,accNo;
    long balance;
    Scanner sc = new Scanner(System.in);
    public void getBalanceAndDepoist() {
        System.out.println("enter Account No: ");
        accNo = sc.nextInt();
        System.out.println("enter Account Balance : ");
        balance = sc.nextInt();
        if (balance != 0) {
            System.out.println("Ready to Withdraw money");
            System.out.println("Enter amount to withdarw ");
            amt = sc.nextInt();
            System.out.println("Your Balance amount is "+ (balance-amt));
        } else {
            System.out.println("Depoist money");
            System.out.println("Enter the amount you want to depoist");
            amt = sc.nextInt();
            balance = balance + amt;
            System.out.println("Enter the amount you want to withdraw");
            amt = sc.nextInt();
            if (balance >= amt) {
                balance = balance - amt;
                System.out.println("Balance after withdrawn " + balance);
            } else {
                System.out.print("Balance is less than " + amt +". " ); 
                System.out.println(" Transaction Failed");
            }
        }
    }

       
    public static void main(String[] args) {
        BankDetails obj=new BankDetails();
        obj.getBalanceAndDepoist();
       
    }
}
