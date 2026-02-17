import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("Enter Password");
        Scanner sc=new Scanner(System.in);
        boolean upper=false;
        String s=sc.nextLine();
        if (s.length()<8) {
            System.out.println("not secure");
        }
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper=true;
            }
        }
        if ( upper&&(s.contains("@")||s.contains("#")||s.contains("$"))) {
            System.out.println("Secure");
            System.out.println("*".repeat(s.length()));
        }
        else{
            System.out.println("Not Secure");
        }
    }
}
