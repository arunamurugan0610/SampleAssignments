package sampleForObjectAsAVaraIable.Java;

public class Coffee {
    Sugar s;
    CoffeeWithMilk c;
    public  Coffee(){
        s=new Sugar();
        c=new CoffeeWithMilk();
    }
    public void prepareCoffee(){
        System.out.println(c.addCoffeeWithMilk());
        System.out.println(s.addSugar());
    }
    public static void main(String[] args) {
        Coffee obj=new Coffee();
        obj.prepareCoffee();
    }
}
