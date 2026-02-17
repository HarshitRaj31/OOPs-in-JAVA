import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        System.out.println("enter");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=obj.nextInt();
        }
        int x=obj.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                System.out.println(" hello" + i);
            }
        }
    }
}
