package JavaSampleProblems;

import java.util.Scanner;

public class Students {
    String name;
    int age;
    int i,j;
    String address;
    String student[][]=new String[2][3];
    public Students(){
        this.name="unknown";
        this.age=0;
        this.address="not available";
    }
    public void setInfo(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name, int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    public void display(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details");
      
        for(i=0;i<student.length;i++){
        	for(j=0;j<student[i].length;j++){
        		  student[i][j]=sc.nextLine();
        	}
    }
       for(i=0;i<student.length;i++){
    	   System.out.println("Student No:" + (i+1) );
    	   System.out.println(student [i][0]+" "  + student [i][1]+" " + student [i][2]);
       }
       
    }
    public static void main(String[] args) {
    	Students obj = new Students();
        obj.display();
    }
}
