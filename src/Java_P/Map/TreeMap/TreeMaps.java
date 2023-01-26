package Java_P.Map.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {

        TreeMap<Integer,String> tre = new TreeMap();

        tre.put(100,"Amit");
        tre.put(102,"Ravi");
        tre.put(101,"Vijay");
        tre.put(103,"Rahul");

        System.out.println(tre);

        for (Map.Entry p : tre.entrySet()){ //iterator key and value
            System.out.println(p.getKey()+" "+p.getValue());
        }


    }
}
