import java.util.Scanner;

public class Divider {
    public static void main(String[] args) {
        System.out.println("Enter a");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter b");
        Scanner sc2 =new Scanner(System.in);
        int b=sc2.nextInt();
        try {
            int result=a/b;
            System.out.println("Result is "+result);
        } catch (ArithmeticException e) {
            System.out.println("Divided by zero not allowed");
        }
        finally{
            System.out.println("Calculation Attempt Finished");
        }
    }
}
