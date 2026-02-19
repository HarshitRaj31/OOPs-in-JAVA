public class Error {
    public static void main(String[] args) {
        MathWizard obj=new MathWizard();
        System.out.println("Factorial is: "+obj.factorial(5));
        try {
            System.out.println("Factorial is: "+obj.factorial(-5));
        } catch (StackOverflowError e) {
          System.out.println("Error it is wrong");
        }
        finally{
            System.out.println("Done");
        }
    }
}
 class MathWizard {
 public int factorial(int n)
 {
    if (n==0||n==1) {
        return 1;
    }
    else
        return n*factorial(n-1);
 }
    
}
