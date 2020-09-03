package ArrayExamples;

//string array , for loop, equal and not equal operators


//using normal method
//public class FindingDuplicate {
//    public static void main (String[] args)
//    {
//        String[] strArr = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};
//        for (int i = 0 ; i < strArr.length-1; i++)
//        {
//            for (int j = i+1 ; j < strArr.length; j++)
//            {
//                if((strArr[i].equals(strArr[j])) && (i != j) )
//                {
//                    System.out.println("Duplicate elements are: "+strArr[j]);
//                }
//            }
//        }
//    }
//}

//using hashset
import java.util.HashSet;

public class FindingDuplicate
{
    public static void main(String[] args)
    {
        String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

        HashSet<String> set = new HashSet<String>();

         for (String arrayElement : strArray)
        {
            if(!set.add(arrayElement))
            {
                System.out.println("Duplicate Element is : "+arrayElement);
            }
        }
    }
}