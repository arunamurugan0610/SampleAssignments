package JavaSampleProblems;

import java.util.Scanner;

public class PotsDivision {
    int totalPots,dividedPots,n;

    public void divisionOfPots() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total number of pots");
        totalPots = sc.nextInt();
        int parts = 2;
        while (totalPots != 1) {
            dividedPots = (totalPots) / 2;
            if (totalPots % 2 == 0) {
                System.out.println("n1 " + dividedPots);
                System.out.println("n2 " + dividedPots);
                totalPots = dividedPots;
            } else {
                System.out.println("n1 " + dividedPots);
                System.out.println("n2 " + dividedPots);
                n = dividedPots + 1;
                totalPots = dividedPots;
            }
           parts++;
        }

        parts = parts * 2;
        System.out.println(parts);
    }
        public static void main(String[] args) {
            PotsDivision obj=new PotsDivision();
            obj.divisionOfPots();
    }
}
