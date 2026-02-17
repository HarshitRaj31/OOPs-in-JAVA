import java.util.Scanner;

public class Pattern {
    public static void main(String args[])
    {
        System.out.println("Enter");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
