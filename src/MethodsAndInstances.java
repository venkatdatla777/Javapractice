class MethodsAndInstances {
    public static void main(String[] args){
        Data obj = new Data();  //object crerated
        String username = "pavanDatla";
        obj.SetString(username);   // passing parameter to the method by using method
        obj.FinalString();         //executing required method to call using object
    }

}
class Data{

    private String finalusername;  //created private variable

    public void SetString(String username){            //method with parameter
    finalusername = username;                          //assigned parameter to private variable
    }

    public String GetString(){
        return finalusername;                   //to return the value added another method
    }

    public void FinalString(){                    // to print output added another method
        System.out.println("the username is: " +finalusername);
    }
}