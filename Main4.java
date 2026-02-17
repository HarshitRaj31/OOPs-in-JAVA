import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.println("");
        Scanner oo=new Scanner(System.in);
        System.out.println("Enter rows and columns");
        int r=oo.nextInt();
        int c=oo.nextInt();
        int[][] A= new int[r][c];
        for (int i = 0; i <r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j]=oo.nextInt();
            }
        }
       
    }
}
class Matrix{


}