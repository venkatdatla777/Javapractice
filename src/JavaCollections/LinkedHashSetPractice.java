package JavaCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetPractice {
    public static void main (String[] args)
    {
        LinkedHashSet<String> LHSet = new LinkedHashSet<String>();
        LHSet.add("pavan");
        LHSet.add("venkat");
        LHSet.add("Raju");
        LHSet.add("Datla");
        LHSet.add("Raju");
        System.out.println(LHSet);
    }
}
