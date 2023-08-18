package JavaSampleProblems;

import java.util.Scanner;

public class Interger {
    int a = 0, b = 0, c = 0, d = 0, e = 0;
    int i;
    int num[] = new int[5];

    public void numbers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 20 numbers");
        for (i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {

          if (num[i] > 0) {
                a++;
            }
            if (num[i] < 0) {
                b++;
            }
            if (num[i] % 2 == 0) {
                c++;
            }
            if (num[i] % 2 != 0) {
                d++;
            }
            if (num[i] == 0) {
                e++;
            }
        }
        System.out.println("no. of positive number " + a);
        System.out.println("no. of negative number " + b);
        System.out.println("no. of even number " + c);
        System.out.println("no. of odd number " + d);
        System.out.println("no. of zero " + e);
    }
        public static void main (String[]args){
            Interger obj = new Interger();
            obj.numbers();
        }
}