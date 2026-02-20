import java.util.InputMismatchException;
import java.util.Scanner;

public class Error2 {
    public static void main(String[] args) {
        System.out.println("Enter a: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter b");
        Scanner sc2=new Scanner(System.in);
        int b=sc2.nextInt();
        Calculator obj=new Calculator();
        System.out.println("Division "+obj.divide(2, 2));
        try { int result=a/b;
            System.out.println("Result is "+result);
            
        } catch (ArithmeticException e) {
            System.out.println("Division by zero not allowed");
        }
        catch(InputMismatchException e){
            System.out.println("Non numeric input");
        }
        catch(Exception e){
          System.out.println("Fallback");
        }
    }
}
 class Calculator {
 public int divide(int a,int b){
   return (a/b);
 }
    
}
