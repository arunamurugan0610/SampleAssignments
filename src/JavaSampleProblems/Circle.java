package JavaSampleProblems;

public class Circle {
int r;

public void area(int r){
    double A;
    A=3.14*r*r;
    System.out.println("Area of the circle is "+ A);
}
    public void circumference(int r){
    double C;
        C=(3.14*2*r);
        System.out.println("Circumference of the circle is "+ C);
    }
    public static void main(String[] args) {
        Circle obj = new Circle();
        obj.area(4);
        obj.circumference(5);
    }
}
