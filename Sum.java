  
    import java.util.Scanner;
        public class Sum{
    public static void main()
    {
        System.out.println("Enter:");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i;
        
        for(i=1;i<=n;i++)
        {
          System.out.println(i*n);
        }
         
    }
}