public class CalculatorWithConstructor {
    int a;
    int b;

//    public CalculatorWithConstructor(int input1 , int input2) //constructor created here with two parameters
//    {
//        a = input1;
//        b = input2;
//    }
    public static void main (String[] args)
    {
        //CalculatorWithConstructor cc = new CalculatorWithConstructor(1,2); //passing values to constructor
        CalculatorWithConstructor cc = new CalculatorWithConstructor();
        System.out.println(cc.a + cc.b);
        System.out.println(cc.a - cc.b);
    }
}
