// to call static method with out creating any object

class StaticClass{
    public static int sum(int a, int b) {  //static method
        return a + b;
    }
}
class Main {
    public static void main(String[] args)
    {
        int a = 1;
        int b = 2;
        int solution = StaticClass.sum(a,b);      //here it is calling above method directly
        System.out.println(solution);

    }

}