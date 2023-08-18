package JavaSampleProblems;

public class TaxIncome {
    double grossSalary;
    double totalSavings;
    double taxableIncome=0;
    public void taxCalculator(double grossSalary,double totalSavings){
       if(totalSavings>1000000){
    taxableIncome=grossSalary-totalSavings;
           System.out.println("the taxable Income is "+taxableIncome);
}else{
    taxableIncome=grossSalary-totalSavings;
    System.out.println("the taxable Income is "+taxableIncome);
}
       if(taxableIncome<=1000000){
           System.out.println("Tax is zero");
       }else if((taxableIncome<2000000)&&(taxableIncome>1000000)){
            System.out.println("Tax is 10 percent");
        }else if((taxableIncome<5000000)&&(taxableIncome>2000000)){
            System.out.println("Tax is 20 percent");
        }else{
            System.out.println("Tax is 50 percent");
        }
    }
    public static void main(String[] args) {
TaxIncome  obj=new TaxIncome();
obj.taxCalculator(6000000,2000000);
    }
}
