package JavaSampleProblems;

import java.util.Scanner;

public class MidCourseSurvey {
    String surveyResult, emailResult;

    public void getSurveyResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter surveyResult");
        String surveyResult = sc.nextLine();
    
        if (surveyResult.equals("yes")) {
            System.out.println("Send an email to the employees");
            System.out.println("Are you willing to attend an interview?");
            
            System.out.println("Enter EmailResult");
            String emailResult = sc.nextLine();
        
            int count=1;
            while(count<=3){
                if(emailResult.equals("yes")) {
                    System.out.println("Schedule an interview");
                    break;
                } else {
                    System.out.println("Send an Email");
                }
                count++;     
                 } 
            
                
        }   else {
            System.out.println("No email can be send to the employees");
        }
        
    }

    public static void main(String[] args) {
        MidCourseSurvey obj=new MidCourseSurvey();
        obj.getSurveyResult();
       
    }
}
