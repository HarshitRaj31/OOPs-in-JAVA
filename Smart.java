public class Smart {
    public static void main(String[] args) {
       SmartFridge obj=new SmartFridge();
       obj.connectToInternet("192-1233-123"); 
       obj.consumePower(24);
    }
}
 interface Electronic {
void consumePower(int cooling); 
}
 interface SmartFeature {
void connectToInternet(String IP);
    
}
 class SmartFridge implements Electronic,SmartFeature {
public void consumePower(int cooling)
{
    int basePrice=1200;
  int unit=basePrice/cooling;
  int power=unit/2;
  System.out.println("Power is: "+power+"kW");
}
public  void connectToInternet(String IP){
System.out.println("IP address is:"+IP);
 }   
}