public class Reverse {
    public static void main(String[] args) {
        StringProcessor o=new StringProcessor();
        String str="Hello";
        System.out.println(str);
        System.out.println("reverse"+o.reverseString(str));
        System.out.println("Vowels"+o.rec(str));
    }
}
class StringProcessor {
public String reverseString(String str)
{
    if (str==null||str.length()==0) {
        return str;
    }
    return reverseString(str.substring(1))+str.charAt(0);
}
    public int rec(String str)
    {
        if (str==null||str.length()==0) {
        return 0;
    }
    char ch=str.charAt(0);
    if (ch=='A'||ch=='a'||ch=='e'||ch=='E'||ch=='I'||ch=='i'||ch=='O'||ch=='o'||ch=='U'||ch=='u') {
        return 1+rec(str.substring(1));
    }
    return rec(str.substring(1));
    }
}
