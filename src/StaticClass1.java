
//static method can access without creating object , if the method belongs to the same class

public class StaticClass1 {
    static int a = 10;
    static int b = 20;
    static int c = a + b ;
    public static void main (String[] args)
    {
        System.out.println (c);
    }
}
