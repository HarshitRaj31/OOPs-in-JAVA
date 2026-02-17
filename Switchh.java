import java.util.Scanner;

public class Switchh {
    public static void main(String []args)
    {
        
       System.out.println("Choose");
       Scanner sc=new Scanner(System.in);
       int button=sc.nextInt();
        
       
       switch (button) {
        case 1:
          Grade obj=new Grade();
            System.out.println(obj.markss(95));
            break;
       case 2:
         Grade2 objj=new Grade2();
            System.out.println(objj.markss(89));
            break;
         case 3:
          Grade3 objjj=new Grade3();
            System.out.println(objjj.markss(77));
            break;   
        default:
            System.out.println("invalid");
            break;
       }
    }
}
 class Parent {

  void markss(){}
}
 class Grade extends Parent {
  
  String markss(int marks)
  {
    
    if (marks>=90) {
     return "O";

    }
    return "Nothing";
    
  }
}
 class Grade2 extends Parent {
String markss(int marks)
{
  if (marks>80 && marks<=89) {
   return "A+";
  }
  return "Nothing";
}
  
}
 class Grade3 extends Parent{
 String markss(int marks)
 {
  if (marks>70 && marks<=79) {
    return "A";
  }
  return "Nothing";
 }
  
}
