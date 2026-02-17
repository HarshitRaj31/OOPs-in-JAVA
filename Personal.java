

public class Personal {
    public static void main(String[] args) {
       Employee obj=new Employee("Harshit", 20, 2000, 100000000);
  obj.display();
    }
}
 class Person {
   String name;
      int age;
  Person(String name,int age){
     this.name=name;
     this.age=age;
  }
   
    
}
class Employee extends Person {
int empID;
double salary;
Employee(String name,int age,int empID,double salary){
super(name, age);
this.empID=empID;
this.salary=salary;
}
  void display(){
    System.out.println("Name"+name);
    System.out.println("age"+age);
    System.out.println("empId"+empID);
    System.out.println("salary"+salary);
  }  
}
