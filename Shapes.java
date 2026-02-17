public class Shapes {
    public static void main(String[] args) {
        Circle obj=new Circle();
        Rectangle oo=new Rectangle();
        Square oooo=new Square();
        System.out.println(""+obj.Area(4));
        System.out.println(obj.Perimeter(4));
        System.out.println(oo.Area(4,6));
        System.out.println(oo.Perimeter(4,5));
        System.out.println(oooo.Area(4));
        System.out.println(oooo.Perimeter(4));
    }
}
 class Shape {
void Area(){}
    void Perimeter(){}
}
 class Circle extends Shape {
     double Area(int r){
    double pi=3.14;
    return pi*r*r;
     }
    double Perimeter(int r)
    {   double pi=3.14;
        return 2*pi*r;
    }
}
 class Rectangle extends Shape {
  int Area(int l,int b)
  {
    return(l*b);
  }
    int Perimeter(int l,int b)
    {
        return(2*(l+b));
    }
}
 class Square extends Shape {
  int Area(int side)
  {
    return(side*side);
  }
    int Perimeter(int side)
    {
        return(4*side);
    }
}
 