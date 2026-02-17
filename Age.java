import java.util.Scanner;

public class Age {
    public static void main(String args[])
    {     System.out.print("Enter your age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if (age>18) {
            System.out.println("adult");
        }
        else{
            System.out.println("not");
        }
        System.out.println("Enter number: ");
        Scanner obj=new Scanner(System.in);
        int x=obj.nextInt();
        if (x%2==0) {
            System.out.println("Even");

        }
        else{
            System.out.println("Odd");
        }
        System.out.println("Enter 2 number: ");
        Scanner on=new Scanner(System.in);
        Scanner or=new Scanner(System.in);
        int a=on.nextInt();
        int b=or.nextInt();
        if (a==b) {
            System.out.println("Equal");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else if (a<b) {
            System.out.println("a is lesser");
        }
    }
}
