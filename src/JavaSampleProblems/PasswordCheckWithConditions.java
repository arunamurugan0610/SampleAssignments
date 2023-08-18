package JavaSampleProblems;

import java.util.Scanner;

public class PasswordCheckWithConditions {
    String Pwd;
    int numeric[]={0,1,2,3,4,5,6,7,8,9};
    public void passwordCheck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter password");
        String Pwd=sc.nextLine();
        if (isPasswordValid(Pwd)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }
    }

    public boolean isPasswordValid(String password) {
        if (password.length() >= 8) {
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }
            }

            return hasUpperCase && hasLowerCase && hasDigit;
        }

        return false;
    }

    public static void main(String[] args) {
        PasswordCheckWithConditions obj = new PasswordCheckWithConditions();
        obj.passwordCheck();
    }
}






