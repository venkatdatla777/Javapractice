import javax.xml.crypto.Data;

class MethodsWithParameters {
    public static void main (String[] args)
    {
        ParameterPassing obj = new ParameterPassing();
        String username = "pavan";
        String password = "datla";
        obj.Data(username,password);

    }
}
     class ParameterPassing{
        public void Data(String username, String password)
        {
            System.out.println("username is: "+username + " " + "password is: "+password);
        }

    }

