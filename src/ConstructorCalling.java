public class ConstructorCalling {
    int a;

//    public ConstructorCalling() //constructor created here without any parameters
//    {
//        a=100;
//    }
    public ConstructorCalling(int b)
    {
        a = b;
    }
    public static void main (String[] args)
    {
        ConstructorCalling cc  = new ConstructorCalling(1111);
        System.out.println(cc.a);
    }

}
