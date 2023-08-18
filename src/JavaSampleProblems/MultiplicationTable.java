package JavaSampleProblems;

import java.util.Scanner;

public class MultiplicationTable {
    int num,i;
    public void multiply(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        for(i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.multiply();
    }
    }