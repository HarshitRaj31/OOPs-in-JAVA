public class AccessModifier {
    String name;
    private int roll;
    double percent;
    public static void chnage(AccessModifier o)
    {
        o.name="Harshit";
    }
    public static void main(String[] args) {
        AccessModifier obj=new AccessModifier();
        obj.name="hars";
        obj.roll=403;
        obj.percent=99;
    }
}
