class InnerConstructor {
    int x= 90 ;
}
class InnerConstructor_1 extends InnerConstructor {
    int x ;

    void show() {
       
        System.out.println(super.x);
    }
}
public class Constructor {
    public static void main(String[] args) {
        InnerConstructor_1 obj = new InnerConstructor_1();
        obj.show();
    }
}
