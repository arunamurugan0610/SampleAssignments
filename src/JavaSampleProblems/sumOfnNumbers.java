package JavaSampleProblems;

import java.util.Scanner;

public class sumOfnNumbers {
    int i,num;
    int sum=0;
    public void sumOfNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum From : ");
        i= sc.nextInt();
        System.out.println("sum upto : ");
        num=sc.nextInt();
        while(i<=num) {
            sum=sum+i;
            i++;
        }
        System.out.println("the sum of numbers is "+ sum);
    }
    public static void main(String[] args) {
        sumOfnNumbers obj=new sumOfnNumbers();
        obj.sumOfNumbers();
    }
}
