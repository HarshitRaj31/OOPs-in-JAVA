import java.util.Scanner;
public class Condition{
    public static void main(String[]args)
    { 
        
        System.out.print("Enter:");
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int[] arr=new int[n];
     int i;
     System.out.println("Enter element:");
     
   for(i=0;i<n;i+=1)
   {
    arr[i]=obj.nextInt();
   }
   System.out.println("Elements are: ");
    for(i=0;i<n;i++)
    {
       System.out.print(arr[i]+" ");
     }
     
     whille();
     doo();
    }
    public static  void whille()
    {
        int i=0;
        while(i<=5)
        { System.out.print(i+" ");
          i++;
        }

    }
    public static void doo(){
        int i=0;
    do{
     System.out.print(i+" ");
     i++; 
    }
    while(i<=4);
    }
}