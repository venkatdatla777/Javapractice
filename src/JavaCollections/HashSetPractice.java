package JavaCollections;
import java.util.HashSet;

public class HashSetPractice {
    public static void main(String[] args)
    {
//        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

        HashSet<String> hset = new HashSet<String>();
        hset.add("pavan");
        hset.add("Datla");
        hset.add("venkat");
        hset.add("raju");
        hset.add("raju");
        System.out.println(hset);

    }
}
