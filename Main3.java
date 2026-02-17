public class Main3 {
    public static void main(String[] args) {
       Bank obj=new SBI();
       Bank obj2=new ICIC();
        System.out.println("ICIC interest"+obj2.getInterestRate());
        System.out.println("SBI"+obj.getInterestRate());
    }
}
 class Bank {
 double getInterestRate(){
   return 0;
 }
    
}
class SBI extends Bank{
    double getInterestRate(){
        return 5.0;
    }
}
class ICIC extends Bank{
    double getInterestRate(){
        return 7.0;
    }
}