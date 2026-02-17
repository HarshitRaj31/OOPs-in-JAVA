import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        System.out.println("Enter.");
        Scanner sc = new Scanner(System.in);
         int scalar=10;
        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] C = new int[r1][c2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                    C[i][j] = A[i][j] + scalar;
            }
        }
        System.out.println("Scalar matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        if (A.length !=B.length||A[0].length !=B[0].length) {
            System.out.println("Matrix dimensions do not match!");
            
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                
                    C[i][j] = A[i][j] + B[i][j];
                
            }
        }
         System.out.println("Matrix Addition");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }

}
