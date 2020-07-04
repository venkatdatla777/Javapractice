public class MethodsAndInstancesWithConstructor {
    public static void main(String[] args){
        Data1 obj1 = new Data1("pavan");  //object crerated for constructor with parameter directly
        obj1.FinalString();

        Data1 obj2 = new Data1("datla"); // created another object to the
        obj2.FinalString();                          // same method with help of constructor

    }

}
class Data1{

    private String finalusername;  //created private variable

   public Data1(String username){      //created Constructor here
       finalusername = username;
   }

    public String GetString(){
        return finalusername;                   //to return the value added another method
    }

    public void FinalString(){                    // to print output added another method
        System.out.println("the username is: " +finalusername);
    }
}
